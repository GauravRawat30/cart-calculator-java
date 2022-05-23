package com.sample.cart.calculator;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	int i = 1;
	
	Cart cart = new Cart();

	Calculator item = new CartCalculator();
	
	

	OrderItem newitem = new OrderItem();

	private List<OrderItem> items = new ArrayList<>();
	

	public List<OrderItem> getItems() {
		
		return items;
	}
	
	public void printOrder() {
		
		/**
		 * ITMES
		 * Name		Base Price		Quantity		Price		Tax			Total
		 * Pizza	$ 5.5			2				$ 11		$ 1.1(@10%)		$ 12.1
		 * 
		 * ORDER
		 * Id : 1
		 * Date : 8 Feb, 2022
		 * Total : 12.1
		 */		
		
	
		
	
		System.out.println("ITEMS");

         if(i == 1) {
	      System.out.println(
			"Name" + "\t" + "Base Price" + "\t" + "Quantity" + "\t" + "Price" + "\t" + "Tax" + "\t\t" + "Total");
		 }
           if(i == 2) {
	        System.out.println(
			"Name" + "\t\t" + "Base Price" + "\t" + "Quantity" + "\t" + "Price" + "\t" + "Tax" + "\t\t" + "Total");
		  }
         if(i == 3) {
	     System.out.println(
			"Name" + "\t" + "Base Price" + "\t" + "Quantity" + "\t" + "Price" + "\t" + "Tax" + "\t\t\t\t" + "Total");
		  }
		
		
		
     System.out.println(item.itemName(cart) + "\t" + "$" + item.itemPrice(cart) + "\t\t" + item.itemQuantity(cart) + "\t\t"
				+ item.priceWithoutTax(cart) + "\t" + "$" + item.addTax(cart) + "(@" +Item.tax + "%)" + "\t" + "$"
				+ item.totalPrice(cart));
	
		System.out.println(" ");
		System.out.println("ORDER");
		System.out.println("ID" + " : " + newitem.newmap.keySet().toArray()[0] );
		System.out.println("Date" + " : " + item.time());
		System.out.println("Total" + " : " + "$" + item.totalPrice(cart));
		
	}


}
