package hw17_Lambda_Expressions;
/*
1. Write a lambda expression for the Printable interface that contains one void print() method.
2. Write a functional interface with a method that takes a number and returns a boolean value.
Write an implementation of this interface as a lambda expression that returns true if the number you pass in
the number is divisible by 13 without a remainder.
 */

public class Main {

    public static void main(String[] args) {

        Printable printable = b -> System.out.println(b);

        WithoutRemainder wr = number -> number % 13 == 0;

        int number = 133;
        printable.print(wr.withoutRemainder(number));
    }
}
