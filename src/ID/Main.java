package ID;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import ID.Console;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Welcome to the Employees Manager\n");
		displayMenu();
				
		String action = "";
		while (!action.equalsIgnoreCase("exit"))
		{
			
			action = Console.getString("Enter a command: ");
			System.out.println();
			
			if(action.equalsIgnoreCase("List"))
			{
				displayAllIds();
			}
				
			else if (action.equalsIgnoreCase("add"))
			{
				addId();
			}
				
			else if (action.equalsIgnoreCase("del") || action.equalsIgnoreCase("delete") )
			{
				deleteId();
			}	
			else if (action.equalsIgnoreCase("help") || action.equalsIgnoreCase("menu") )
			{
				displayMenu();
			}	
			
			else if (action.equalsIgnoreCase("exit"))
			{
				System.out.println("Bye.\n");	
			}
			else
			{
				System.out.println("Error! Not a valid command. \n");	
			}
				
		}
				
	}

	public static void displayMenu()
	{
		System.out.println("COMMAND MENU");
		System.out.println("list   -List all Employees");
		System.out.println("add    -add a Employee");
		System.out.println("del    -delete a  Employee");
		System.out.println("help   -show this menu");
		System.out.println("exit   -Exit this application");
	}
	
	//Changed from void to String
	public static String displayAllIds() throws IOException
	{
		
		//System.out.println("EMPLOYEES LIST");
		
		List< IDs > ids = IDIO.getAll();
		SortingAlphabetically.Sort();
		updafefiles.updatefiles();
		
		
		StringBuilder sb = new StringBuilder();
		if(ids == null)
		{
			System.out.println("\nError! Unable to get products.\n");
	    }
		else
		{
			IDs d;
			//StringBuilder sb = new StringBuilder();
			for (IDs database : ids)
			{
				d = database;
				sb.append(StringUtil.pad(d.getId(), 10));
				sb.append(StringUtil.pad(d.getName(), 20));
				sb.append(StringUtil.pad(d.getAge(), 5));
				sb.append(StringUtil.pad(d.getOccupation(), 25));
				sb.append(d.getHWFormatted());
				sb.append("\n");
				
			}
			
			//System.out.println(sb.toString());	
	}
		return sb.toString();
		}
	
	public static void addId()
	{
	
		String id = Console.getString("Enter persons's id: ");
		String name = Console.getString("Enter person's name: ");
		String age = Console.getString("Enter person's age: " );
		String occupation = Console.getString("Enter person's occupation: " );
		double hw = Console.getDouble("Enter person's hourly wage: ");
		
		IDs d = new IDs();
		d.setId(id);
		d.setName(name);
		d.setAge(age);
		d.setOccupation(occupation);
		d.setHW(hw);
		
		IDIO.add(d);
		System.out.println("\n" + name  + " was added to the database.\n");
		

	}
	
	public static void deleteId()
	{
		String id = Console.getString("Enter product code to delete: ");
		
		IDs d = IDIO.get(id);
		if (d ==  null)
		{
			System.out.println("\nError: Unable to get product.");
		}
		else
		{
			IDIO.delete(d);
			System.out.println("\n" + d.getName() + " was deleted from the database. \n");
		}
	}
	
	
	
	
	
}

