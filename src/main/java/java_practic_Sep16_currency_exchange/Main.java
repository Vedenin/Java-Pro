package java_practic_Sep16_currency_exchange;
/*
First level: Есть следующие курсы валют

1 USD = 0.98 EUR (1 доллар США)
1 AUD = 0.67 EUR (1 австралийский доллар)
1 CAD = 0.75 EUR (1 канадский доллар)
1 CNH = 0.14 EUR (1 китайский юань)

Сделать Map в которой в качестве ключей будет код валюты, в качестве значения ее курс к евро (значения ввести вручную).
Написать функцию принимающее на вход название валюты и количество, на выход возвращающей сумму в Евро.

Например, возможная сигнатура функции

public double convertToEUR(String currencyCode, double amount) {

Или

public double convertToEUR(String currencyCode, double amount, Map rates) // rates - ваша Map с курсами валют

Вывести пример работы функции в System.out.println в main

Second level: То же, что в level 1, но в качестве ключей использовать Enum c кодами валюты (либо стандартный
класс Currency, пример тут https://www.geeksforgeeks.org/java-util-currency-methods-example/ )
реализовать функцию перевода суммы как к евро, так и обратно. Возможная сигнатура дополнительного метода

public double convertFromEUR(CurrencyEnum currency, double amount) { // currency - код валюты, в которую нужно конвертировать евро

Вывести пример работы двух функций в System.out.println в main
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> rates = new HashMap<>();
        rates.put("1 USD", 0.98);
        rates.put("1 AUD", 0.67);
        rates.put("1 CAD", 0.75);
        rates.put("1 CNH", 0.14);

      //  System.out.println(convertToEUR("AUD", 100, rates));
    }

//    public static double convertToEUR(String currencyCode, double amount, Map rates) {
//
//    }
}
