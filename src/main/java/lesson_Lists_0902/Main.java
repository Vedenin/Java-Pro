package lesson_Lists_0902;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        User user1 = new User("Petriv", "petrov@mail.com", "qwerty");
        User user2 = new User("Sidorov", "sidorov@mail.com", "asdfg");

        List<User> users = new ArrayList<>(Arrays.asList(user1, user2));

        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    public static String getUsersString(List<User> users) {

        StringBuilder builder = new StringBuilder();

        for (User user : users) {
            String email = user.getEmail();
            String name = user.getName();
            if (!email.contains("@")) {
                builder.append(name).append(",");
            }
            String result = builder.toString();

            if (!result.isEmpty()) return result.substring(0, result.length() - 1);
        }
        return null;
    }
}
