package java_practic_Sep23_ReportService;
/*
First level: Представим у нас есть некоторый сервис (ReportService), который возвращает статистические финансывые отчеты о филиалах вида (параметр - страна)
Report
Страна филиала,
Сумма продаж за год,
Сумма прибыли за год,
Но оказалось, что построенние данного отчета занимает очень много времени и вас заказчик попросил реализовать сервис кеширования (CacheService) с помощью HashMap,
который по стране филиала либо запрашивает данные у ReportService (если в кеше данных еще нет, а потом сохранает их в кеш), либо берет данные из кеша сразу (если они там уже сохранены).

Сам сервис отчета (ReportService) реализовывать полностью не нужно, можно просто возвращать некоторые случайные данные каждый раз (например, используя Math.random).
Важно реализовать именно сервис кеширования (CacheService)

Second level: То же самое, что в level 1, но в отчет добавить город и департамент (они же будут параметрами при запросе у CacheService и ReportService),
поэтому потребуется сделать кеширование с помощью дополнительного класса (не забудьте про equals и hashcod) или вложенных HashMap.

В случае, проблем с реализацией можно посмотреть то что мы делали на уроке код StreetService (https://github.com/tel-ran-de/tasks31m/blob/main/javapractic23092022/src/main/java/com/github/telran_de/StreetService.java).
 */

import java.math.BigDecimal;

public class Main {
    public static CacheService cacheService = new CacheService();
    private static void printy(String country, String city, String department) {
        BigDecimal[] a = cacheService.getCache(country, city, department);
        System.out.printf("%s %s %s %8.2f %8.2f %n", country, city, department, a[0], a[1]);
    }
    public static void main(String[] args) throws InterruptedException {

        printy("United Kingdom", "London", "Don");
        printy("United Kingdom", "Manchester", "Chester");
        printy("United Kingdom", "London", "Don");
        printy("Austria", "Wien", "Wi");
        printy("Austria", "Linz", "Li");
        printy("Ireland", "Waterford", "water");
        printy("Italy", "Venedig", "Ven");
        printy("Norway", "Oslo", "Oslo");
        printy("Belgium", "Bruegge", "Brue");
        printy("United Kingdom", "Manchester", "Chester");
        printy("Finland", "Helsinki", "Chesr");

        cacheService.getMapCashe("Belgium", "Bruegge","Brue");
        cacheService.getMapCashe("Belgium", "Bruegge","Brue");
        cacheService.getMapCashe("Italy", "Venedig","Ven");
        cacheService.getMapCashe("Norway", "Bergen","Ber");
        cacheService.getMapCashe("Belgium", "Bruegge","Brue");
        cacheService.getMapCashe("Norway", "Bergen","Be");
        cacheService.getMapCashe("Italy", "Venedig","Ven");
        cacheService.getMapCashe("Norway", "Oslo","Oslo");
        cacheService.getMapCashe("Finland", "Helsinki","Chesr");
        cacheService.getMapCashe("Italy", "Venedig","Ven");

    }
}