package InventoryMangment;

public class TestInventry {
	public static void main(String args[]){
		
		
		Invoice i = new Invoice("jay",10.0,"07-02-2017");
        Item i1 = new Item(1,199,3,399);
        Item i2 = new Item(10,10,3,3000);
        i.addItem(i1,5);
        i.addItem(i2,6);
        i.setTaxRate(10.0);
        
        
        System.out.println(i1.getCost()+i1.getQty()+i.getInvoiceAmount());
        
	}

}

