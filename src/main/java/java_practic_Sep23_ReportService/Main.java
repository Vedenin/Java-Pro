package java_practic_Sep23_ReportService;

import java.math.BigDecimal;

public class Main {
    public static String[] countries = {"United Kingdom", "Austria", "Finland","Azerbaijan", "United Kingdom", "Belgium",
            "Bulgaria", "Czech Republic", "Finland", "France", "Finland","Belgium", "Germany", "Azerbaijan", "Ireland",
            "Italy", "Luxembourg", "Belgium", "Monaco", "Montenegro", "Norway", "Singapore",
            "Slovenia", "Sweden", "Azerbaijan", "Switzerland", "Finland", "United Kingdom"};

    public static CacheService cacheService = new CacheService();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < countries.length; i++) {
            printy(countries[i]);
        }
    }

    public static void printy(String country) {
        BigDecimal[] a =cacheService.getSalesAndProfit(country);
        System.out.printf("%s %8.2f %8.2f %n", country, a[0], a[1]);
    }
}
