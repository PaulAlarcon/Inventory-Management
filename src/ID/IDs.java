package ID;

import java.text.NumberFormat;

public class IDs {
	
	private String ID;
	private String Age;
	private String Name;
	private String Occupation;
	private double HourlyWage;
	
	public IDs()
	{	ID = "";
		Name = "";
		Age = "";
		Occupation = "";
		HourlyWage = 0.0;
	}
	
		public void setId (String id){this.ID = id;}
		public String getId(){return ID;}
	
		public void setName (String name){this.Name = name;}
		public String getName(){return Name;}
	
		public void setAge (String string){this.Age = string;}
		public String getAge(){return Age;}
	
		public void setOccupation(String occupation){this.Occupation = occupation;}
		public String getOccupation(){return Occupation;}
		
		public void setHW (double hourlywage){this.HourlyWage = hourlywage;}
		public double getHW(){return HourlyWage;}
		
		public String getHWFormatted() {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(getHW());
		}
		
		
	}

