package hw13_HashMap;
/*
Output the number of occurrences of each character in the string "Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.".
Output letter-by-letter statistics in descending order.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. " +
                "Nam molestie diam sed libero egestas pellentesque. Nulla.";
        String[] strings = str.toLowerCase().split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            String el = String.valueOf(s);
            if (el.equals(" ")) el = "\"space\"";
            map.put(el, map.containsKey(el) ? map.get(el) + 1 : 1);
        }

        // sort by values in descending order
        List <Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("Sort by values in descending order \n");
        for (Map.Entry<String, Integer> s : list) {
            System.out.println("The symbol " + s.getKey() + " is found " + s.getValue() + " times.");
        }

        System.out.println("-".repeat(20));

//        // sort by keys in descending order
        List <Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        list2.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getKey() == o2.getKey()) {
                    return 0;
                }
                if (o1.getKey() == null) {
                    return -1;
                }
                if (o2.getKey() == null) return 1;
                return o2.getKey().compareTo(o1.getKey());
            }
        });

        System.out.println("Sort by keys in descending order \n");
            for (Map.Entry<String, Integer> s : list2) {
                System.out.printf("The symbol %s is found %d times.\n", s.getKey(), s.getValue());
            }
    }
}
