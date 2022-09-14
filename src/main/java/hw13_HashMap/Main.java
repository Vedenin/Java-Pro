package hw13_HashMap;
/*
Output the number of occurrences of each character in the string "Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.".
Output letter-by-letter statistics in descending order.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";
        String elem;
        int count = 0;
        Map<String, Integer> mapLetters = new HashMap<>();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(i, String.valueOf(str.charAt(i)));
        }

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            elem = item.getValue().toLowerCase();
            for (Integer value : map.keySet()) {
                if (elem.equals(map.get(value).toLowerCase())) count++;
            }
            mapLetters.put(elem, count);
            count = 0;
        }

        for (Map.Entry<String, Integer> item : mapLetters.entrySet()) {
            System.out.println("The symbol " + item.getKey() + " is found " + item.getValue() + " times.");
        }
        System.out.println("-".repeat(20));

        // sort by values in descending order
        List <Map.Entry<String, Integer>> list = new ArrayList<>(mapLetters.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("Sort by values in descending order \n");
        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            System.out.println("The symbol " + item.getKey() + " is found " + item.getValue() + " times.");
        }
        System.out.println("-".repeat(20));

        // sort by keys in descending order
        List <Map.Entry<String, Integer>> list2 = new ArrayList<>(mapLetters.entrySet());
        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getKey() == o2.getKey()) {return 0;}
                if(o1.getKey() == null) {return -1;}
                if(o2.getKey() == null) return 1;
                return o2.getKey().compareTo(o1.getKey());
            }
        });

        System.out.println("Sort by keys in descending order \n");
        Iterator<Map.Entry<String, Integer>> iter2 = list2.iterator();
        while(iter2.hasNext()){
            Map.Entry<String, Integer> item = iter2.next();
            System.out.println("The symbol " + item.getKey() + " is found " + item.getValue() + " times.");
        }
    }
}
