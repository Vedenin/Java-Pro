package hw4;

public class Cat extends Animal {
	public Cat (String name) {
		super("Cat " + name);
		this.runLimit = 200;
		this.swimLimit = 0;
	}
	
}
