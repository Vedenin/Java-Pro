package hw10_LinkedList;
/*
1. There are two LinkedLists containing integers. The numbers in them are in ascending order.
You need to get a third LinkedList, which is a union of the first two, and the numbers in it should also be
in ascending order. For example, from the lists 1 - 2 - 4 and 1 - 3 - 4 you should get 1 - 1 - 2 - 3 - 4 - 4.

2. There is an ArrayList containing integers and number k. The numbers in ArrayList must be cyclically shifted
to the right by k positions. For example, 1 - 2 - 3 - 4 - 5 - 6 at k = 1 is converted to 6 - 1 - 2 - 3 - 4 - 5,
and at k = 3 to 4 - 5 - 6 - 1 - 2 - 3.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> one = new LinkedList<>(Arrays.asList(1, 4, 5, 10));
        LinkedList<Integer> two = new LinkedList<>(Arrays.asList(1, 2, 3, 8, 11, 21));
        System.out.println(joinedLists(one, two));

        ArrayList<Integer> three = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int k = 3;
        System.out.println(shiftedArray(three, k));
    }

    private static LinkedList<Integer> joinedLists(LinkedList<Integer> one, LinkedList<Integer> two) {
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

    private static ArrayList<Integer> shiftedArray (ArrayList<Integer> list, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add(0);
        }

        for (int i = 0; i < list.size(); i++) {
            result.set((i + k) % list.size(), list.get(i));

        }
        return result;
    }

}
