package hw3;
/*
Create a class Pizza with the fields: size of type String (with possible values "small", "medium" and "large"),
cheese:int, pepperoni:int, ham:int=0. Add a Pizza constructor (String size, int cheese, int pepperoni, int ham),
getters, setters and toString. Add a calcPrice() method: int - small 10, medium 12, large 14 and each topping 2.
Create a PizzaOrder class where pizza can be added using the add(Pizza) method and
write a calcTotalPrice(): int method that will calculate the total order amount for all pizzas.
 */

import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		
		PizzaOrder pizzaOrder1 = new PizzaOrder();
		pizzaOrder1.addPizza("s", 2, 2, 2);
		out.printf("Order: %d pizza cost %d%n%s", pizzaOrder1.getCount(), pizzaOrder1.calcTotalPrice(), pizzaOrder1.showPizzas());

		pizzaOrder1.addPizza("l", 0, 4, 1);
		out.printf("+ Order: %d pizza(s) cost(s) %d%n%s", pizzaOrder1.getCount(), pizzaOrder1.calcTotalPrice(), pizzaOrder1.showPizzas());
		
		PizzaOrder pizzaOrder2 = new PizzaOrder();
		pizzaOrder2.addPizza("s", 2, 2, 2);
		out.printf("Order: %d pizza cost %d%n%s", pizzaOrder2.getCount(), pizzaOrder2.calcTotalPrice(), pizzaOrder2.showPizzas());
		
		pizzaOrder2.addPizza("m", 4, 0, 0);
		out.printf("+ Order: %d pizza(s) cost(s) %d%n%s", pizzaOrder2.getCount(), pizzaOrder2.calcTotalPrice(), pizzaOrder2.showPizzas());
		
		pizzaOrder2.addPizza("l", 1, 1, 2);
		out.printf("+ Order: %d pizza(s) cost(s) %d%n%s", pizzaOrder2.getCount(), pizzaOrder2.calcTotalPrice(), pizzaOrder2.showPizzas());
	}
}
