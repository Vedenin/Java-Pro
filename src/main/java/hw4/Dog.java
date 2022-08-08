package hw4;

public class Dog extends Animal {
	public Dog (String name) {
		super("Dog "+ name);
		this.runLimit = 500;
		this.swimLimit = 10;
	}
}
