package lesson_ArrayList_0826;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
1. There are two classes: Address with fields street and houseNumber, and Person with fields name and address.
Write a method List<Address> getAddresses (List<Person>persons).
From a list of persons you have to return a list of their addresses.
*/
        Person person1 = new Person("Ivanov", new Address("Tolstoj", 18));
        Person person2 = new Person("Sidorov", new Address("Puwkin", 13));
        Person person3 = new Person("Petrov", new Address("Dostoevskij", 108));
        Person person4 = new Person("Kozlov", new Address("Akhmatova", 134));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person4);

        System.out.println(getAddresses(persons));
/*
2. There is a list of names: John, Thomas, Tim, Jack, Amalia. Write a method
to return a list containing all names of the original list but those with a length of 4.
*/
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("John", "Thomas", "Tim", "Jack", "Amalia"));
        System.out.println(without4(nameList));

/*
3. There are two lists of equal length containing integers. Write a method to
return a list with items Yes or No where the value at the i-th place
depends on whether the elements of the two lists numbered i are equal.
For example {1,2,3,4} and {5,2,3,0} will return {No,Yes,Yes,No}
*/

        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(5, 2, 3, 0));
        ArrayList<Integer> three = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        System.out.println(compareLists(one, two));
/*
4. Write a method that joins two lists of integers into one.
public List<Integer> joined(List<Integer>list1, List<Integer> list2)
 */
        System.out.println(iteratorOfArrays(one, three));
        System.out.println(joined(one, two));
        System.out.println(merge(one, two));

/*
5.There is a list with integers. Write a method that returns the list without elements greater than the given one.
List<Integer> lessThanN(List<Integer>ints, int n)
 */
        ArrayList<Integer> intsList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2));
        System.out.println(lessThanN(intsList, 4));
    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> returnAddresses = new ArrayList<>();

        for (Person p : persons) {
            returnAddresses.add(p.getAddress());
        }
        return returnAddresses;
    }

    public static List<String> without4(List<String> list) {
        List<String> copyList = new ArrayList<>(list);
        for (String name : copyList) {
            if (name.length() == 4) {
                list.remove(name);
            }
        }
        return list;
    }

    public static List<String> compareLists(ArrayList<Integer> one, ArrayList<Integer> two) {
        List<String> result = new ArrayList<>();
        String s;
        for (int i = 0; i < one.size(); i++) {
            s = "No";
            if (one.get(i) == two.get(i)) {
                s = "Yes";
            }
            result.add(s);
        }
        return result;
    }

    public static ArrayList<Integer> iteratorOfArrays(List<Integer> one, List<Integer> two) {
        ArrayList<Integer> results = new ArrayList<>();
        ListsIterator listIntegrated = new ListsIterator(one, two);
        while (listIntegrated.hasNext()) {
            results.add(listIntegrated.next());
        }
        return results;
    }

    public static ArrayList<I2> joined(List<Integer> one, List<Integer> two) {
        ArrayList<I2> result = new ArrayList<>();
        for (int i = 0; i < one.size(); i++) {
            result.add(new I2(one.get(i), two.get(i)));
        }
        return result;
    }

    public static <T> List<T> merge(List<T> one, List<T> two) {
        List<T> result = new ArrayList<>();
        result.addAll(one);
        result.addAll(two);

        return result;
    }

    public static List<Integer> lessThanN(List<Integer> ints, int n) {
        List<Integer> copyInts = new ArrayList<>(ints);
        for (Integer var : copyInts) {
            if (var.intValue() > n) {
                ints.remove(var);
            }
        }
        return ints;
    }
}
