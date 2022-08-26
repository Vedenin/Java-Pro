package lesson_ArrayList_0826;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
There are two classes: Address with fields street, houseNumber and Person with fields name, address.
You need to write a method List<Address> getAddresses (List<Person>persons).
That is, from the list of persons to return a list of their addresses.
*/
        Person person1 = new Person("Ivanov", new Address("Tolstoj", 18));
        Person person2 = new Person("Sidorov", new Address( "Puwkin", 13));
        Person person3 = new Person("Petrov", new Address("Dostoevskij", 108));
        Person person4 = new Person("Kozlov", new Address( "Akhmatova", 134));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person4);

        System.out.println(getAddresses(persons));

    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> returnAddresses = new ArrayList<>();

        for(Person p : persons) {
            returnAddresses.add(p.getAddress());
        }
        return returnAddresses;
    }

    /*public List<String> without4 (List<String>list) {
        return null;
    }*/

}
