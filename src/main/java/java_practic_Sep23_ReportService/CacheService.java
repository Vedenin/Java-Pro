package java_practic_Sep23_ReportService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CacheService {
    private final Map<String, BigDecimal[]> salesAndProfitCache = new HashMap<>();

    public BigDecimal[] getCache(String country, String city, String department) {
        String key = country + department + city;
        if (salesAndProfitCache.containsKey(key)) {
            return salesAndProfitCache.get(key);
        } else {
            BigDecimal[] sap = ReportService.salesAndProfit(country, city, department);
            salesAndProfitCache.put(key, sap);
            return sap;
        }
    }

    private final Map<String, Map<String, String>> filialsCache = new HashMap<>();

    public final Map<String, Map<String, String>> getMapCashe(String country, String city, String department) throws InterruptedException {

        if (filialsCache.containsKey(country)) {
            System.out.println(country + " " + filialsCache.get(country));
        } else {

            filialsCache.put(country, new HashMap<>());
            filialsCache.get(country).put(city, department);
            System.out.println(country + " " + filialsCache.get(country));
            Thread.sleep(2000);
        }
        return filialsCache;
    }
}