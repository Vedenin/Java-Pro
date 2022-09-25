package hw15_non_repeating_char;
/*
Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(searchUniqueChar("leetcode"));
        System.out.println(searchUniqueChar("loveleetcode"));
        System.out.println(searchUniqueChar("aabb"));

        searchUniqueCharUsingMap("leetcode");
        searchUniqueCharUsingMap("loveleetcode");
        searchUniqueCharUsingMap("aabb");
    }

    private static int searchUniqueChar(String s) {
        int index = -1;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            int j;
            for (j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    break;
                }
            }
            if (j == length) {
                return i;
            }
        }

        return index;
    }

    private static void searchUniqueCharUsingMap(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("No unique char");
    }
}
