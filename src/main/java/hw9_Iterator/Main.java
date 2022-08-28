package hw9_Iterator;
/*
Write an iterator over an array.
There must be a class (let's call it ArrayIterator, for example) that implements the Iterator interface.
*/

public class Main {
    public static void main(String[] args) {

        String[] array = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        toIterate(array);
    }

    public static void toIterate(String[] array) {
        ArrayIterator arrayIterator = new ArrayIterator<>(array);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}