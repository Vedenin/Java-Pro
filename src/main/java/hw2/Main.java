package hw2;

/*
Describe a class "color dot". The coordinates and the color are set for a point.
The color is described using three components (red, green, blue).
Provide various methods for initializing an object with validation of values.
The valid range for each component is [0, 255].
Describe properties for getting the state of an object and a method for changing the color.
Write a program that demonstrates all the developed elements of the class.
The developed class should, as a rule, contain the following elements:
hidden fields, constructors with and without parameters, methods, properties.
 */

public class Main {
	public static void main(String[] args) {
		
		ColorDot colorDot0 = new ColorDot();
		ColorDot colorDot1 = new ColorDot(10, 15, -1000, 25, 225);
		ColorDot colorDot2 = new ColorDot(50, 100, -200);
		
		System.out.println("colorDot 0");
		System.out.println(colorDot0);
		colorDot0.changeColor(100, 100, 100);
		colorDot0.getProperties();
		
		System.out.println("colorDot 1");
		System.out.println(colorDot1);
		colorDot1.changeColor(100, 25, -5);
		colorDot1.getProperties();
		
		System.out.println("colorDot 2");
		System.out.println(colorDot2);
		colorDot2.setRcolor(250);
		colorDot2.setGcolor(0);
		colorDot2.setCoordinateX(100);
		colorDot2.setCoordinateY(800);
		colorDot2.getProperties();
	}
}
