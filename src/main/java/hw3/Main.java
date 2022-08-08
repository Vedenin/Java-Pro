package hw3;
/*
Create a class Pizza with the fields: size of type String (with possible values "small", "medium" and "large"),
cheese:int, pepperoni:int, ham:int=0. Add a Pizza constructor (String size, int cheese, int pepperoni, int ham),
getters, setters and toString. Add a calcPrice() method: int - small 10, medium 12, large 14 and each topping 2.
Create a PizzaOrder class where pizza can be added using the add(Pizza) method and
write a calcTotalPrice(): int method that will calculate the total order amount for all pizzas.
 */

public class Main {
	public static void main(String[] args) {
		
		PizzaOrder pizzaOrder = new PizzaOrder();
		pizzaOrder.addPizza("s", 2, 2, 2);
		System.out.println("Order: " + pizzaOrder.getCount() + " pizza(s) cost(s) " + pizzaOrder.calcTotalPrice());

		pizzaOrder.addPizza("l", 0, 4, 1);
		System.out.println("Order: " + pizzaOrder.getCount() + " pizza(s) cost(s) " + pizzaOrder.calcTotalPrice());

	}
}
