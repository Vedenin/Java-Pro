package java_practic_Sep23_ReportService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CacheService {
    Map<String, BigDecimal[]> salesAndProfitCache = new HashMap<>();

    public BigDecimal[] getSalesAndProfit(String country) {
        if (salesAndProfitCache.containsKey(country)) {
            return salesAndProfitCache.get(country);
        }
        BigDecimal[] sap = ReportService.salesAndProfit(country);
        salesAndProfitCache.put(country, sap);
        return sap;
    }
}
