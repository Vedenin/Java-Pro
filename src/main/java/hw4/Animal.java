package hw4;

public class Animal {
	protected String name;
	protected double runLimit;
	protected double swimLimit;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public void run(int distance) {
		if (distance >= 0 && distance <= runLimit) {
			System.out.println(this.name + " ran " + distance + " meters");
		} else {
			System.out.println(this.name + " can't run " + distance + " meters. This is beyond the limit.");
		}
	}
	
	public void swim(int distance) {
		if (distance >= 0 && distance <= swimLimit) {
			System.out.println(this.name + " swam " + distance + " meters");
		} else {
			System.out.println(this.name + " can't swim " + distance + " meters. This is beyond the limit.");
		}
	}
	
}
