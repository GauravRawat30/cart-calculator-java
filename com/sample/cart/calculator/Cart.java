package com.sample.cart.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Cart {

	private List<Item> items = new ArrayList<>();

	public Cart() {
	
		super();
		items.add(new Item("Pizza", 5.5, 2));
		items.add(new Item("Garlic Bread", 2.9));
		items.add(new Item("Coke", 0.99, 10));

	}

	public List<Item> getItems() {

		return items;
	}

}
