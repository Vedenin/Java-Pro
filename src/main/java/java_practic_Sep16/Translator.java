package java_practic_Sep16;

import java.util.*;

public class Translator {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hi".toUpperCase(), "Привет");
        dictionary.put("Hello".toUpperCase(), "Привет");
        dictionary.put("World".toUpperCase(), "Мир");
        dictionary.put("Ivan".toUpperCase(), "Иван");
        dictionary.put("Car".toUpperCase(), "Машина");

        Set<String> notTranslateWords = new HashSet<>();
        notTranslateWords.add("a");
        notTranslateWords.add("the");
        notTranslateWords.add(" ");

        String str = "Hello the world! Hi, a car !".trim();

        String[] words = str.replace(",", "")
                .replace("!", "").split(" ");

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            if (!notTranslateWords.contains(word)) {
                builder.append(dictionary.get(word.toUpperCase())).append(" ");
            }
        }
        System.out.println(builder);
    }
}
