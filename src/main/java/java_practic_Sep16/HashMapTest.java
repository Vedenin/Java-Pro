package java_practic_Sep16;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        String str = "Hello world! Hi World! Hello Ivan!";
        String stringWithSpace = str.replace("!", " ").replace(" ", "=").replace("=", " ");
        String[] words = stringWithSpace.split(" ");
        Map<String, List<String>> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.putIfAbsent(word, new ArrayList<>());

            List<String> list = wordsCount.get(word);
            list.add(word);
            wordsCount.put(word, list);
        }
        System.out.println(wordsCount);
    }
}
