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

public class Main {
    public static void main(String[] args) {
        List<Integer> one = new LinkedList<>(Arrays.asList(1, 4, 5, 10));
        List<Integer> two = new LinkedList<>(Arrays.asList(1, 2, 3, 8, 11, 21));
        System.out.println(joinedLists(one, two)); // using an iterator
        System.out.println(mergeLists(one, two));  // using merge with .get(elements of List)

        List<Integer> three = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int k = -9; k < 11; k++) {
            System.out.println("k = " + k + " " + shiftedArray(three, k));   // Array Rotation.
        }
        System.out.println("-".repeat(20));

        List<Integer> four = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (int k = -3; k < 21; k++) {
            System.out.println("k = " + k + " " + shiftedArray2(four, k));   // Array Rotation.
        }
        int m = 4;
        System.out.println(shiftedArray2(four, m));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 12, 23, 23, 34, 45, 45, 45, 45, 45, 57, 67, 89, 90, 90));
        System.out.println(removeRepetitiveElements(list)); // using arrays

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 12, 23, 23, 34, 45, 45, 45, 45, 45, 57, 67, 89, 90, 90));
        System.out.println(removeRepetitiveElements2(list2)); // using an iterator

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 12, 23, 23, 34, 45, 45, 45, 45, 45, 57, 67, 89, 90, 90));
        System.out.println(removeRepetitiveElements3(list3));
    }

    private static List<Integer> joinedLists(List<Integer> one, List<Integer> two) {
        List<Integer> results = new LinkedList<>();

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
        int j = - k;
        while (j < 0) j += list.size();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get((i + j) % list.size()));
        }
        return result;
    }

    private static List<Integer> shiftedArray2(List<Integer> list, int k) {
        k %= list.size();
        for (int i = 0; i < k; i++) {
            int last = list.get(list.size() - 1);
            list.add(0, last);
            list.remove(list.size() - 1);
        }
        return list;
    }

    private static List<Integer> removeRepetitiveElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    private static List<Integer> removeRepetitiveElements2(List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = list2.iterator();

        Integer old = null;
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i != old) {
                result.add(i);
                old = i;
            }
        }
        return result;
    }

    private static List<Integer> removeRepetitiveElements3(List<Integer> list) {
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                list.set(count, list.get(i + 1));
                count++;
            }
        }
        return list.subList(0, count);
    }
}
