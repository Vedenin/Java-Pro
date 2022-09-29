package java_practic_Sep23_ReportService;

import java.math.BigDecimal;

public class ReportService {

    public static BigDecimal[] salesAndProfit (String country) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        } finally {
            return new BigDecimal[]{BigDecimal.valueOf((1. + Math.random() * 0.3) * 56765478.), BigDecimal.valueOf((1. + Math.random() * 0.3) * 159878.)};
        }
    }
}
