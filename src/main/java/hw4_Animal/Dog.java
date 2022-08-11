package hw4_Animal;

public class Dog extends Animal {
	private static final int MAX_RUN_DISTANCE = 500;
	private static final int MAX_SWIM_DISTANCE = 10;
	public Dog (String name) {
		super("Dog "+ name);
		this.runLimit = MAX_RUN_DISTANCE;
		this.swimLimit = MAX_SWIM_DISTANCE;
	}
}
