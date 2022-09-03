package hw10_LinkedList;
/*
1. There are two LinkedLists containing integers. The numbers in them are in ascending order.
You need to get a third LinkedList, which is a union of the first two, and the numbers in it should also be
in ascending order. For example, from the lists 1 - 2 - 4 and 1 - 3 - 4 you should get 1 - 1 - 2 - 3 - 4 - 4.

2. There is an ArrayList containing integers and number k. The numbers in ArrayList must be cyclically shifted
to the right by k positions. For example, 1 - 2 - 3 - 4 - 5 - 6 at k = 1 is converted to 6 - 1 - 2 - 3 - 4 - 5,
and at k = 3 to 4 - 5 - 6 - 1 - 2 - 3.

3. Remove repetitive elements in ArrayList.
Examples:
Input: ArrayList = [1, 2, 2, 2, 3, 4, 4, 4]
Output: [1, 2, 3, 4]
Input: ArrayList = [12, 23, 23, 34, 45, 45, 45, 45, 45, 57, 67, 89]
Output: [12, 23, 34, 45, 57, 67, 89]
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> one = new LinkedList<>(Arrays.asList(1, 4, 5, 10));
        List<Integer> two = new LinkedList<>(Arrays.asList(1, 2, 3, 8, 11, 21));
        System.out.println(joinedLists(one, two)); // using an iterator
        System.out.println(mergeLists(one, two));  // using merge with .get(elements of List)

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int k = 9;
        System.out.println(shiftedArray(list1, k));    // Array's Rotation
        System.out.println(rotateRightList(list2, k)); // Working For Right Rotation
        System.out.println(rotateLeftList(list3, k));  // Working For Left Rotation

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 4, 4, 4, 12, 23, 23, 34, 45, 45, 45, 45, 45, 57, 67, 89));
        System.out.println(removeRepetElm(list));
    }

    private static List<Integer> joinedLists(List<Integer> one, List<Integer> two) {
        LinkedList<Integer> results = new LinkedList<>();

        Iterator<Integer> i1 = one.iterator();
        Iterator<Integer> i2 = two.iterator();
        Integer e1 = i1.next();
        Integer e2 = i2.next();

        while (true) {
            Integer r;

            if (e1 == null && e2 == null) {
                return results;
            }

            if (e1 == null) {
                r = e2;
                e2 = null;
                if (i2.hasNext()) {
                    e2 = i2.next();
                }
            } else if (e2 == null) {
                r = e1;
                e1 = null;
                if (i1.hasNext()) {
                    e1 = i1.next();
                }
            } else {
                if (e1 < e2) {
                    r = e1;
                    e1 = null;
                    if (i1.hasNext()) {
                        e1 = i1.next();
                    }
                } else {
                    r = e2;
                    e2 = null;
                    if (i2.hasNext()) {
                        e2 = i2.next();
                    }
                }
            }
            results.add(r);
        }
    }

    private static List<Integer> mergeLists(List<Integer> one, List<Integer> two) {
        List<Integer> result = new LinkedList<>();
        int i = 0, j = 0;
        while (i < one.size() && j < two.size()) {
            if (one.get(i) < two.get(j)) {
                result.add(one.get(i));
                i++;
            } else {
                result.add(two.get(j));
                j++;
            }
        }
        if (i < one.size()) {
            result.addAll(one.subList(i, one.size()));
        }
        if (j < two.size()) {
            result.addAll(two.subList(j, two.size()));
        }
        return result;
    }

    private static List<Integer> shiftedArray(List<Integer> list, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
            result.set((i + k) % list.size(), list.get(i));

        }
        return result;
    }

    private static List<Integer> rotateRightList(List<Integer> list, int k) {

        for (int i = 0; i < k; i++) {

            int last = list.size() - 1;
            int temp = list.get(last);

            for (int j = last; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }
        return list;
    }

    private static List<Integer> rotateLeftList(List<Integer> list, int k) {

        for (int i = 0; i < k; i++) {

            int temp = list.get(0);
            int size = list.size() - 1;

            for (int j = 0; j < size; j++) {
                list.set(j, list.get(j + 1));
            }
            list.set(size, temp);
        }
        return list;
    }

    private static List<Integer> removeRepetElm(List<Integer> list) {
        List<Integer> result = list.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        return result;
    }
}
