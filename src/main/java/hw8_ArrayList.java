import java.util.ArrayList;
/*
Даны два ArrayList, представляющих два неотрицательных целых числа. Цифры, составляющие эти числа, хранятся по отдельности в ArrayList. Например,
ArrayList a = new ArrayList<>();
a.add(2);
a.add(4);
a.add(3);
представляет трехзначное число 243.
Написать программу, которая складывает два числа, заданных подобным образом и получает ответ в виде нового ArrayList.
 */

public class hw8_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(6);
        b.add(3);


        int number = getNumber(a);
        System.out.println(number);
        System.out.println(getArrayList(number));
        System.out.println(getNumber2(a));
        System.out.println(sum( a, b));

    }

    private static ArrayList<Integer> sum(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int remainder = 0;
        int i = a.size() - 1;
        int j = b.size() - 1;
        while (i >= 0 || j >= 0) {
            int value1 = 0;
            if (i >= 0) {
                value1 = a.get(i);
                i--;
            }
            int value2 = 0;
            if (j >= 0) {
                value2 = b.get(j);
                j--;
            }
            result.add(0,(value1 + value2 + remainder) % 10);
            remainder = (value1 + value2 + remainder) / 10;
        }
        if (remainder > 0) result.add(0, remainder);
        return result;
    }

    private static int getNumber(ArrayList<Integer> a) {
        String str = "";
        for (Integer integer : a) str += integer;
        return Integer.parseInt(str);
    }

    private static int getNumber2(ArrayList<Integer> a) {
        int answer = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            answer += a.get(i) * (int)Math.pow(10, a.size() - i - 1);
        }
        return answer;
    }

    private static ArrayList<Integer> getArrayList(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer.add(Integer.parseInt("" + str.charAt(i)));
        }
        return answer;
    }
}
