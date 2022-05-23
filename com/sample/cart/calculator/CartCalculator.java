package com.sample.cart.calculator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartCalculator implements Calculator {

	@Override
	public Order calculate(Cart cart) {
		List<Object> calcitem = new ArrayList<>();
		calcitem.add(this.itemName(cart));
		calcitem.add(this.itemPrice(cart));
		calcitem.add(this.itemQuantity(cart));
		calcitem.add(this.priceWithoutTax(cart));
		calcitem.add(this.addTax(cart));
		calcitem.add(this.totalPrice(cart));
		calcitem.add(this.time());

		System.out.println(calcitem);
		System.out.println("--------------------------------------------------------------");
		

		return new Order();

	}

	int i = 1;

	@Override
	public String itemName(Cart cart) {
		String name = cart.getItems().get(i - 1).getName();

		return name;
	}

	@Override
	public double itemPrice(Cart cart) {
		double price = cart.getItems().get(i - 1).getPrice();
		return price;
	}

	@Override
	public int itemQuantity(Cart cart) {
		int quantity = cart.getItems().get(i - 1).getQuantity();
		return quantity;
	}

	@Override
	public double priceWithoutTax(Cart cart) {
		// double price = itemPrice() * itemQuantity();
		double price = cart.getItems().get(i - 1).getPrice() * cart.getItems().get(i - 1).getQuantity();
		return price;
	}

	@Override
	public double addTax(Cart cart) {
		// double taxinrupee = priceWithoutTax() * tax;
		double taxinrupee = cart.getItems().get(i - 1).getPrice() * cart.getItems().get(i - 1).getQuantity() * Item.tax
				/ 100;
		return taxinrupee;
	}

	@Override
	public double totalPrice(Cart cart) {
		// double totPrice = addTax() + priceWithoutTax();
		double totPrice = cart.getItems().get(i - 1).getPrice() * cart.getItems().get(i - 1).getQuantity() * Item.tax
				/ 100 + cart.getItems().get(i - 1).getPrice() * cart.getItems().get(i - 1).getQuantity();
		return totPrice;
	}

	@Override
	public String time() {
		SimpleDateFormat formDate = new SimpleDateFormat("d MMM yyyy");
		String strDate = formDate.format(new Date());
		return strDate;
	}

}
