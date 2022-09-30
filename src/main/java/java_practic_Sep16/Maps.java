package java_practic_Sep16;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Set<String> notTranslateWords = new TreeSet<>();
        notTranslateWords.add("a");
        notTranslateWords.add("the");
        notTranslateWords.add("a");
        notTranslateWords.add(" ");
        notTranslateWords.add("the");

        List<String> list = new ArrayList<>(notTranslateWords);

        // Вывод множества (set) в алфовитном порядке
//        for(String s: list) {
//            System.out.println(s);
//        }

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hi", "Привет");
        dictionary.put("Hello", "Привет");
        dictionary.put("World", "Мир");
        dictionary.put("Ivan", "Иван");
        dictionary.put("Car", "Машина");

        String str = "Hello Cars, Ivan52, Worlds";

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (str.contains(key)) {
                System.out.println(value);
            }
        }

        // Вывод ключей
//        for(String word: dictionary.keySet()) {
//            System.out.println(word);
//        }
//
//        // Вывод значений
//        for(String word: dictionary.values()) {
//            System.out.println(word);
//        }
    }
}
