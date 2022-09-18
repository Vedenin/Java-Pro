package hw14_HashSet_HashMap;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return
the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashSet_HashMap {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] numbers1 = new int[]{2, 2};

        int[] nums2 = new int[]{4, 9, 5};
        int[] numbers2 = new int[]{9, 4, 9, 8, 4};

        intersection(nums1, numbers1);
        intersection(nums2, numbers2);
    }

    private static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }

        Map<Integer, Integer> numbers = new HashMap<>();
        for (Integer i : nums1) {
            numbers.put(i, numbers.containsKey(i) ? numbers.get(i) + 1 : 1);
        }

        for (int i : nums2) {
            if (numbers.containsKey(i)) {
                result.add(i);
                numbers.put(i, numbers.get(i) - 1);
            }
        }
        System.out.println(result);
        return result;
    }
}
