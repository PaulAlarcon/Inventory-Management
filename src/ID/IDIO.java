package ID;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class IDIO
{	private static final Path DatabasePath = Paths.get("sc.text"); 
	private static final File DatabaseFile = DatabasePath.toFile();
	private static final String FIELD_SEP = "\t";
	public static final String IDIO = null; 
	private static List< IDs > database = getAll();

	private IDIO() {}; 

	
	public static List< IDs > getAll()
	{
		

		if (database !=null)
		{
			return database;
		}

		database = new ArrayList<> ();

		if (Files.exists(DatabasePath))
		{
			try (BufferedReader in = new BufferedReader( new FileReader(DatabaseFile)))
			{	
				SortingAlphabetically.Sort();
				updafefiles.updatefiles();
				String line = in.readLine();
				while (line != null)
				{
					String [] columns = line.split(FIELD_SEP);
					String id = columns[0];
					String name = columns[1];
					String age = columns[2];
					String occupation = columns[3];
					String hourlywage = columns[4];

					IDs d = new IDs();

					d.setId(id);
					d.setName(name);
					d.setAge(age);
					d.setOccupation(occupation);
					d.setHW(Double.parseDouble(hourlywage));
					database.add(d);
					line = in.readLine(); 
				}


			}
			catch(IOException e)
			{
				System.out.println(e);
				return null;
			}
		}
		return database;
	}

	public static IDs get(String id) 
	{
		for (IDs d : database)
		{
			if (d.getId().equals(id))
				return d;
		}

		return null;
	}


	private static boolean saveAll()
	{
		try(PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(DatabaseFile))))
		{
		SortingAlphabetically.Sort();
		updafefiles.updatefiles();


			for (IDs d : database)
			{
				out.print(d.getId() + FIELD_SEP);
				out.print(d.getName() + FIELD_SEP);
				out.print(d.getAge() + FIELD_SEP);
				out.print(d.getOccupation() + FIELD_SEP);
				out.println(d.getHW());
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			return false;
		}
		return true;
	}

	public static boolean add(IDs d)
	{
		database.add(d);
		return saveAll();
	}

	public static boolean delete(IDs d)
	{	  database.remove(d);
	return saveAll();
	}

	//tried to implement the sort inside but didnt work as wanted it
	/*public static boolean Sort(IDs d){

		try {
			ArrayList<String> rows = new ArrayList<String>();
			BufferedReader reader = new BufferedReader(new FileReader("sc.text"));
			String s;
			while((s = reader.readLine())!=null)
				rows.add(s);
			Collections.sort(rows);	
			FileWriter writer = new FileWriter("sc.text");
			for(String cur: rows)
			writer.write(cur+"\n");
			reader.close();
			writer.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return saveAll();
	}
*/
	public static boolean update(IDs newId) throws IOException
	{
		IDs oldId = get(newId.getId());
		int i = database.indexOf(oldId);
		database.remove(i);
		database.add(i, newId);
		SortingAlphabetically.Sort();
		updafefiles.updatefiles();
		return saveAll();
	}
}



