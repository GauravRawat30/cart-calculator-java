package com.sample.cart.calculator;

public class Item {
	
	private String name;
	
	private double price;
	
	private int quantity;
	
	public static double tax = 10d; // Percentage
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}
	
	public Item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}
