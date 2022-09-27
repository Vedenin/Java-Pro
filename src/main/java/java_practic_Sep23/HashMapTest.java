package java_practic_Sep23;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        Integer[] ages = {41, 25, 36, 31, 25};
        Set<Integer> setAges = new HashSet<>(Arrays.asList(ages));
        System.out.println(setAges);

        String[] listOfWords = {"This", "hotel", "was", "terrible"};
        Set<String> goodWords = new HashSet<>(Arrays.asList(
                "ok", "wonderful", "great"
        ));
        Set<String> badWords = new HashSet<>(Arrays.asList(
                "bad", "terrible", "awful"
        ));
        int goodRate = 0;
        for (String word : listOfWords) {
            if (goodWords.contains(word)) {
                goodRate++;
            } else if (badWords.contains(word)) {
                goodRate--;
            }
        }
        System.out.println(goodRate);

        String str1 = "google.com";
        String str2 = "amazon.com";

        Set<String> urls = new HashSet<>();
        urls.add(str1);
        urls.add(str2);
        urls.add("google.com");

        for (String str : urls) {
            System.out.println(str);
        }

        Map<String, String> dictionary = new HashMap<>(); // словарь англо-русский
        dictionary.put("Hi".toUpperCase(Locale.ROOT), "Привет"); // приводим к одному регистру для поиска при разном написании
        dictionary.put("Hello".toUpperCase(Locale.ROOT), "Привет");
        dictionary.put("World".toUpperCase(Locale.ROOT), "Мир");
        dictionary.put("Ivan".toUpperCase(Locale.ROOT), "Иван");
        dictionary.put("Car".toUpperCase(Locale.ROOT), "Машина");

        Set<String> notTranslateWords = new HashSet<>(); // множество слов, которые мы не будет переводить
        notTranslateWords.add("a");
        notTranslateWords.add("the");
        notTranslateWords.add(" ");

        String str = "     Hello the wORld! Hi, a Car !   ".trim();
        System.out.println(str);
        String[] words = str.replace(",", "")
                .replace("!", "").split(" "); // приводим к одному виду разделителей (функций replace
        // и разбиваем на массив отдельных слов

        for (String word : words) {
            if (!notTranslateWords.contains(word)) { // исключаем слова из множества notTranslateWords
                System.out.println(dictionary.get(word.toUpperCase(Locale.ROOT))); // выводим перевод
            }
        }
    }
}

