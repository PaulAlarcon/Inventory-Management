package ID;
import java.util.Scanner;



public class IDsApp { 

	private static String id;
	public static void main(String[] args) 
	{
		
	System.out.println("Welcome to the IDs Application.");
		
	Report r = new Report();
	getLineItems(r);
	displayReport(r);

	}	
	
	public static void getLineItems(Report r) {
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			String id = Console.getString("Enter id number : ");
			int hours = Console.getInt("Enter hours worked: ");
			
			IDs ID = IDIO.get(id);
			r.addItem(new LineItem(ID, hours));
			
			choice = Console.getString("Another line item (y/n): ");
			System.out.println();
		}
	}
	public static String displayReport(Report r) {
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtil.pad("Id #",10));
		sb.append(StringUtil.pad("Name",20));
		sb.append(StringUtil.pad("Age",5));
		sb.append(StringUtil.pad("Ocupation",25));
		sb.append(StringUtil.pad("Hourly Wage",15));
		sb.append(StringUtil.pad("Hours", 10));
		sb.append(StringUtil.pad("Total", 10));
		sb.append("\n");
		for (LineItem lineItem: r.getLineItem()) {
			IDs ID = lineItem.getIDS();

			sb.append(StringUtil.pad(ID.getId(),10));
			sb.append(StringUtil.pad(ID.getName(),20));
			sb.append(StringUtil.pad((ID).getAge(),5));
			sb.append(StringUtil.pad(ID.getOccupation(),25));
			sb.append(StringUtil.pad(ID.getHWFormatted(),15));
			sb.append(StringUtil.pad(lineItem.getHoursFormatted(), 10));
			sb.append(StringUtil.pad(lineItem.getTotalFormatted(), 10));
			sb.append('\n');
		}
		sb.append("\nAmount Paid ");
		sb.append(r.getTotalFormatted());
		//System.out.println(sb);
		return sb.toString();
	}
}







	