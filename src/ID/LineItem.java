package ID;

import java.text.NumberFormat;

public class LineItem {
	//2 data members
	private IDs ID;
	private int hours;
	
	public LineItem() {
		this.ID = null;
		this.hours = 0;
	}
	
	public LineItem(IDs ID, int hours) {
		this.ID = ID;
		this.hours = hours;
	}
	
	public void setIDS(IDs ID) {
		this.ID = ID;
	}
	
	public IDs getIDS() {
		return ID;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public double getTotal() {
		double total = hours * (ID.getHW());
		return total;
	}
	
	public String getTotalFormatted() {
		double total = this.getTotal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalFormatted = currency.format(total);
		return totalFormatted;
	}
	
	public String getHoursFormatted() {
		int hours = this.hours;
		String hoursFormatted = String.format ("%d", hours);
		return hoursFormatted;
	}
}


