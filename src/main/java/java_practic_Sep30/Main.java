package java_practic_Sep30;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 1, 7, 3, 9, 5, 7, 3, 6, 8);
        list.stream()
                .mapToInt(integer -> integer + 2)
                .forEach(System.out::println);

//            for (Integer p : list) {
//            System.out.println(p + 2);
//        }
        list.stream()
                .filter(p -> p % 2 == 0)
                .forEach(p -> System.out.println (p + 2));
    }
}
