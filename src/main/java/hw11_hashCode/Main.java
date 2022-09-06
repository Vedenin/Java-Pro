package hw11_hashCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, 1.000001);
        Point point2 = new Point(1, 1.0000);
        Point point3 = new Point(1, 1.000000000000001);
        Point point4 = new Point(1, 1);
        Point point5 = new Point(2.1, 3);

        if (point1.hashCode() == point2.hashCode()) {
            System.out.println("1 and 2 are " + point1.equals(point2));
        }
        if (point2.hashCode() == point4.hashCode()) {
            System.out.println("2 and 4 are " + point2.equals(point4));
        }
        if (point2.hashCode() == point3.hashCode()) {
            System.out.println("2 and 3 are " + point2.equals(point3));
        }
        if (point3.hashCode() == point4.hashCode()) {
            System.out.println("3 and 4 are " + point3.equals(point4));
        }
        if (point4.hashCode() == point5.hashCode()) {
            System.out.println("4 and 5 are " + point4.equals(point5));
        }

        System.out.println("hashCode 1 is " + point1.hashCode());
        System.out.println("hashCode 2 is " + point2.hashCode());
        System.out.println("hashCode 3 is " + point3.hashCode());
        System.out.println("hashCode 4 is " + point4.hashCode());
        System.out.println("hashCode 5 is " + point5.hashCode());
    }
}
