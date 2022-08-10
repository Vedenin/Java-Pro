package hw4;

public class Cat extends Animal {
	private static final int MAX_RUN_DISTANCE = 200;
	public Cat (String name) {
		super("Cat " + name);
		this.runLimit = MAX_RUN_DISTANCE;
		this.swimLimit = 0;
	}
	
}
