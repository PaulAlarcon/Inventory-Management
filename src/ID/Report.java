package ID;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Report {
	private ArrayList<LineItem> lineItems;
	
	//The constructor
	public Report() {
		lineItems = new ArrayList();
	}
	
	//Add an item to the ArrayList
	public void addItem(LineItem li) {
		lineItems.add(li);
	}
	
	//Get accessor for the line item collection
	public ArrayList<LineItem> getLineItem() {
		return lineItems;
	}
	
	//Method that gets the invoice total
	public double getTotal() {
		double reportTotal = 0;
		for (LineItem li: lineItems) {
			reportTotal += li.getTotal();
		}
		return reportTotal;
	}
	
	//A method that returns the invoice total in currency format
	public String getTotalFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotal());
	}
}
