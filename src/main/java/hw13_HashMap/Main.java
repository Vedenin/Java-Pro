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

        List <Map.Entry<String, Integer>> list = new ArrayList<>(mapLetters.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            System.out.println("The symbol " + item.getKey() + " is found " + item.getValue() + " times.");
        }
    }
}
