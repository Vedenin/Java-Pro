package hw3;

import java.util.ArrayList;

public class PizzaOrder {
	private int count = 0;
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    PizzaOrder () {
	}
	
	public int getCount() {
		return count;
	}
	
	public void addPizza(String size, int cheese, int pepperoni, int ham) {
		pizzas.add(new Pizza(size, cheese, pepperoni, ham));
		count++;
	}
	
	public int calcTotalPrice() {
		int price = 0;
		for (int i = 0; i < count; i++) {
			price += pizzas.get(i).calcPrice();
		}
		return price;
	}
}
