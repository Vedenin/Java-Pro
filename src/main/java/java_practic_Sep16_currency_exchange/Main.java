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

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Currency, Double> rates = new HashMap<>();

    public static Currency c1 = Currency.getInstance("USD");
    public static Currency c2 = Currency.getInstance("AUD");
    public static Currency c3 = Currency.getInstance("CAD");
    public static Currency c4 = Currency.getInstance("CNY");
    public static Currency c5 = Currency.getInstance("EUR");

    public static BigDecimal convertToEUR(Currency currency, double amount, Map<Currency, Double> rates) {
        return new BigDecimal(amount * rates.get(currency));
    }

    public static BigDecimal convertToEUR (String currencyCode, double amount) {
        CurrencyEnum cE = CurrencyEnum.valueOf(currencyCode);
        return new BigDecimal( amount * cE.getRate());
    }

    public static BigDecimal convertFromEUR (String currencyCode, double amount) {
        CurrencyEnum cE = CurrencyEnum.valueOf(currencyCode);
        return new BigDecimal( amount / cE.getRate());
    }

    public static void addRates() {
        rates.put(c1, 1.013232);
        rates.put(c2, 0.672527);
        rates.put(c3, 0.752339);
        rates.put(c4, 0.143185);
        rates.put(c5, 1.);
    }

    public static void main(String[] args) {
        addRates();

        double amount1 = 100.0105;
        double amount2 = 1000;
        double amount3 = 100;
        double amount4 = 101.18;

        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount3, c1.getCurrencyCode(), c1.getSymbol(),
                convertToEUR(c1, amount3, rates), c5.getCurrencyCode(), c5.getSymbol());
        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount1, c2.getCurrencyCode(), c2.getSymbol(),
                convertToEUR(c2, amount1, rates), c5.getCurrencyCode(), c5.getSymbol());
        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount2, c3.getCurrencyCode(), c3.getSymbol(),
                convertToEUR(c3, amount2, rates), c5.getCurrencyCode(), c5.getSymbol());
        System.out.println();

        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount3, CurrencyEnum.AUD, CurrencyEnum.AUD.getSymbol(),
                convertToEUR(CurrencyEnum.AUD.getCurrencyCode(), amount3), CurrencyEnum.EUR, CurrencyEnum.EUR.getSymbol());
        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount3, CurrencyEnum.USD, CurrencyEnum.USD.getSymbol(),
                convertToEUR(CurrencyEnum.USD.getCurrencyCode(), amount3), CurrencyEnum.EUR, CurrencyEnum.EUR.getSymbol());
        System.out.println();

        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount3, CurrencyEnum.EUR, CurrencyEnum.EUR.getSymbol(),
                convertFromEUR(CurrencyEnum.CNY.getCurrencyCode(), amount3), CurrencyEnum.CNY, CurrencyEnum.CNY.getSymbol());
        System.out.printf("%.2f %s(%s) = %.2f %s(%s)\n", amount4, CurrencyEnum.EUR, CurrencyEnum.EUR.getSymbol(),
                convertFromEUR(CurrencyEnum.USD.getCurrencyCode(), amount4), CurrencyEnum.USD, CurrencyEnum.USD.getSymbol());
    }
}
