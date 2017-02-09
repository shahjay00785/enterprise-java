package InventoryMangment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Invoice {

    HashMap<Item,Integer> items;
	private double tax;
	private String  customer_number,date;
    private double tax_rate;
    static int invoiceNumber = 0 ;
    int CIN;
	
	 Invoice(String customer_number,double tax_rate,String date){
	        this.date = date;
	        this.customer_number = customer_number;
	        this.tax_rate = tax_rate;
	        invoiceNumber ++;
	        this.CIN = invoiceNumber;
	        this.items=new HashMap<Item,Integer>();
	    }
	
	public void addItem(Item item,int qty){
		if ( this.items.containsKey(item) ) {
			int q = this.items.get(item);
			q += qty;
			this.items.put(item,q);
		}
		else {
			this.items.put(item,qty);
		}
		
	}
	
	public int[] getQtys(){ 
		Set <Map.Entry<Item,Integer>> s = this.items.entrySet();
		Iterator<Map.Entry<Item,Integer>> itr = s.iterator();
		int l[] = new int[s.size()];
		int i=0;
		while(itr.hasNext()) {
			l[i] = itr.next().getValue();
			i++;
		}
		return l;
	}
	
	public void setTaxRate(double tax_rate){
		this.tax=tax_rate; 
	}
	
	public double getInvoiceAmount(){
		Set <Map.Entry<Item,Integer>> s = this.items.entrySet();
		Iterator<Map.Entry<Item,Integer>> itr = s.iterator();
		double t=0;
		while ( itr.hasNext() ) {
			Map.Entry<Item,Integer> m = itr.next();
			t += m.getKey().getCost() * m.getValue();
		}
		t += (1 + this.tax/100);
		return t;
	}
	
	public double getTaxAmount(){
		Set <Map.Entry<Item,Integer>> s = this.items.entrySet();
		Iterator<Map.Entry<Item,Integer>> itr = s.iterator();
		double t=0;
		while ( itr.hasNext() ) {
			Map.Entry<Item,Integer> m = itr.next();
			t += m.getKey().getCost() * m.getValue();
		}
		t += (this.tax/100);
		return t;
		
	}
	
	public void print(){
		 
		
	
		
	}
	
	
}

