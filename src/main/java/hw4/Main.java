package hw4;
/*
1. Create classes "Dog" and "Cat" with inheritance from the class "Animal".
2. All animals can run and swim. The length of the obstacle is passed as a parameter to each method.
The result of the action will be printed to the console.
For example dogBobik.run(150); -> 'Bobik ran 150 m'.
3. Each animal has restrictions on actions:
- running: cat - 200 m, dog - 500 m;
- swimming: the cat cannot swim, the dog - 10 m.
 */

import hw1.Employee;

public class Main {
	public static void main(String[] args) {
		
		Dog dea = new Dog("Dea");
		dea.run(500);
		dea.swim(20);
		
		Dog erik = new Dog("Erik");
		erik.run(125);
		erik.swim(5);
		
		Cat ivar = new Cat("Ivar");
		ivar.run(100);
		
		Cat verona = new Cat("Verona");
		verona.run(250);
		verona.swim(1);
	}
}
