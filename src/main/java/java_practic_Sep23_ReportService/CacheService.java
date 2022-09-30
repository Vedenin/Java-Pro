package java_practic_Sep23_ReportService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CacheService {
    static class Key {
        String country;
        String city;
        String department;

        public Key(String country, String city, String department) {
            this.country = country;
            this.city = city;
            this.department = department;
        }
    }
    static class Values {
        String city;
        String department;

        public Values(String city, String department) {
            this.city = city;
            this.department = department;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Values values = (Values) o;
            return Objects.equals(city, values.city) && Objects.equals(department, values.department);
        }
        @Override
        public int hashCode() {
            return Objects.hash(city, department);
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


    private final Map<Key, Values> cashe = new HashMap<>();
    private final Map< String, Map<String, String>>  cache = new HashMap<>();
    private final Map< Map<String, Map<String, String>> , BigDecimal[]> filialsCache = new HashMap<>();
    public final Map<Map<String, Map<String, String>>, BigDecimal[]> getMapCashe(String country, String city, String department) {

        if (cache.containsKey(country)) {
            System.out.println(country + " " + city + " " + department + cache.get(country));
            return filialsCache;
        }

        BigDecimal[] sap = ReportService.salesAndProfit(country, city, department);
        cache.put(country, new HashMap<>());
        cache.get(country).put(city, department);
        filialsCache.put(cache, sap);
        System.out.println(country + " " + city + " " + department + " " + sap[0] + " " + sap[1]);
        return filialsCache;
    }
}