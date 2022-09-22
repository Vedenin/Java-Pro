package java_practic_Sep16_currency_exchange;

public enum CurrencyEnum {
    USD("USD","$", 1.013232),
    AUD("AUD","A$", 0.672527),
    CAD("CAD","CA$",0.752339),
    CNY("CNY","¥", 0.143185),
    EUR("EUR","€", 1);

    private final String currencyCode;
    private final String symbol;
    private final double rate;

    CurrencyEnum(String currencyCode, String symbol, double rate) {
        this.currencyCode = currencyCode;
        this.symbol = symbol;
        this.rate = rate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getRate() {
        return rate;
    }
}
