package com.sample.cart.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderItem {

	int i = 1;

	Cart item = new Cart();

	Map<Integer, Object> newmap = new HashMap<>();

	public OrderItem() {

		newmap.put(i, item.getItems().get(i - 1));
	}

}
