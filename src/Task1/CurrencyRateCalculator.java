package Task1;

public class CurrencyRateCalculator {
    public static double calculate(double amount, String currency) {
        double result = 0.0;
        switch (currency) {
            case "USD" -> result = amount * ExchangeRate.USD;
            case "GBP" -> result = amount * ExchangeRate.GBP;
            case "FRF" -> result = amount * ExchangeRate.FRF;
            case "DEM" -> result = amount * ExchangeRate.DEM;
            case "JPY" -> result = amount * ExchangeRate.JPY;
            default -> System.out.println("Invalid currency!");
        }
        return result;
    }
}
