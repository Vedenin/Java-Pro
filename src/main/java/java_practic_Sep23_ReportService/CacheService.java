package java_practic_Sep23_ReportService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CacheService {
    String country;
    String city;
    String department;
    public CacheService() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheService that = (CacheService) o;
        return Objects.equals(country, that.country) && Objects.equals(city, that.city) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, department);
    }

    private final Map<String, Map<String, String>> cache = new HashMap<>();
    private final Map<Map<String, Map<String, String>>, BigDecimal[]> filialCache = new HashMap<>();

    public final Map<Map<String, Map<String, String>>, BigDecimal[]> getMapCashe(String country, String city, String department) {

        if (cache.containsKey(country)) {
            for (Map.Entry<String, Map<String, String>> entry : cache.entrySet()) {
                Map<String, String> filial = entry.getValue();
                if (filial.containsKey(city) && filial.containsValue(department)) {
                    System.out.printf("%s %s %s %n", country, cache.get(country), Arrays.toString(filialCache.get(cache)));
                    return filialCache;
                }
            }
        }

        BigDecimal[] sap = ReportService.salesAndProfit(country, city, department);
        cache.put(country, new HashMap<>());
        cache.get(country).put(city, department);
        filialCache.put(cache, sap);
        System.out.printf("%s %s %s %n", country, cache.get(country), Arrays.toString(filialCache.get(cache)));
        return filialCache;
    }
}