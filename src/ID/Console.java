package ID;

import java.util.Scanner;

public class Console
{
	private static Scanner sc = new Scanner(System.in);
	public static String getString(String prompt)
	{
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}
	
	public static double getDouble(String prompt) {
		double i = 0.0;
		//boolean choice = true;
		
		while (true) {
			System.out.print(prompt);
			try {
				i = Double.parseDouble(sc.nextLine());
				//choice = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Error: Invalid integer. Try again.");
			}		
						
		return i;
		}
	}
	
		public static int getInt(String prompt) {
			int m  = 0;
			boolean choice = true;
			while (choice) {
				System.out.print(prompt);
				try {
					m = Integer.parseInt(sc.nextLine());
					choice = false;
				}
				catch (NumberFormatException e) {
					System.out.println("Error: Invalid integer. Try again.");
				}
				
		
	}
			return m;}}




		


/*public static double getDouble(String prompt) {
double i = 0.0;
//boolean choice = true;

while (true) {
	System.out.print(prompt);
	try {
		i = Double.parseDouble(sc.nextLine());
		//choice = false;
	}
	catch (NumberFormatException e) {
		System.out.println("Error: Invalid integer. Try again.");
	}*/		
			
