package hw16_set_Mismatch_using_Map;
/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number
and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 4};
        int[] array2 = {1, 1};
        int[] array3 = {1, 2, 3, 3, 4};

        System.out.println(setMismatch(array1));
        System.out.println(setMismatch(array2));
        System.out.println(setMismatch(array3));
    }

    private static List<Integer> setMismatch(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();

        for (Integer i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int a;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    list.add(i);
                    list.add(i + 1);
                }
            }
        }

        return list;
    }
}