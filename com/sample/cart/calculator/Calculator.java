package com.sample.cart.calculator;

public interface Calculator {

	public Order calculate(Cart cart);

	public String itemName(Cart cart);

	public double itemPrice(Cart cart);

	public int itemQuantity(Cart cart);

	public double priceWithoutTax(Cart cart);

	public double addTax(Cart cart);

	public double totalPrice(Cart cart);

	public String time();
	
	

}
