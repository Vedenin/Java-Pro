package java_practic_Sep23_ReportService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CacheService {
    static class Countries {
        String country;
        String department;
        String city;

        public Countries(String country, String department, String city) {
            this.country = country;
            this.department = department;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Countries{" +
                    "country='" + country + '\'' +
                    ", department='" + department + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    static class Filials {

        String department;
        String city;

        public Filials(String department, String city) {
            this.department = department;
            this.city = city;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Filials filials = (Filials) o;
            return Objects.equals(department, filials.department) && Objects.equals(city, filials.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(department, city);
        }

        @Override
        public String toString() {
            return "Filials{" +
                    "department='" + department + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    private final Map<String, BigDecimal[]> salesAndProfitCache = new HashMap<>();

    public BigDecimal[] getCache(String country, String city, String department) {
        String key = country + department + city;
        if (salesAndProfitCache.containsKey(key)) {
            return salesAndProfitCache.get(key);
        }
        BigDecimal[] sap = ReportService.salesAndProfit(country, city, department);
        salesAndProfitCache.put(key, sap);
        return sap;
    }

    private Map<Countries, Filials> Cache = new HashMap<>();
    private Map<String, Map<String, String>> filialsCache = new HashMap<>();

    public final Map<String, Map<String, String>> getMapCashe(String country, String city, String department) throws InterruptedException {

        if (filialsCache.containsKey(country)) {
            System.out.println(country + " " + filialsCache.get(country));
            return filialsCache;
        }

        filialsCache.putIfAbsent(country, new HashMap<>());
        filialsCache.get(country).put(city, department);
        System.out.println(country + " " + filialsCache.get(country));
        Thread.sleep(2000);
        return filialsCache;
    }
}