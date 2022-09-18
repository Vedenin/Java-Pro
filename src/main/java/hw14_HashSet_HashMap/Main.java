package hw14_HashSet_HashMap;
// What will the code snippet print?
// The code will print out 4. We added 4 different objects (p1, p2, p3, p4) with different links to a HashSet
// and then called to print the size of the HashSet.
// If we want the collection to take into account the content of these objects,
// we need to Override the hashCode and equals methods for the Person class.

import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
        HashSet set = new HashSet<>();
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.print(set.size());
    }
}

class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
