package com.sample.cart.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartCalculationApp {
	
	public static void main(String args[]) {
		CartCalculator calculator = new CartCalculator();
		Cart cart = new Cart();
		
		
		Order order = calculator.calculate(cart);
		
		order.printOrder();
		
		

}
}
