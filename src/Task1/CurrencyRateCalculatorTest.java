package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyRateCalculatorTest {

    @Test
    void calculateExchangeRatesForZeroUSD() {
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "USD"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "GBP"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "FRF"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "DEM"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "JPY"));
    }

    @Test
    void calculateExchangeRatesForOneUSD() {
            assertEquals(1.0, CurrencyRateCalculator.calculate(1.0, "USD"));
            assertEquals(1.487, CurrencyRateCalculator.calculate(1.0, "GBP"));
            assertEquals(0.172, CurrencyRateCalculator.calculate(1.0, "FRF"));
            assertEquals(0.584, CurrencyRateCalculator.calculate(1.0, "DEM"));
            assertEquals(0.00955, CurrencyRateCalculator.calculate(1.0, "JPY"));
    }

    @Test
    void calculateExchangeRatesForOneHundredUSD() {
            assertEquals(100.0, CurrencyRateCalculator.calculate(100.0, "USD"));
            assertEquals(148.7, CurrencyRateCalculator.calculate(100.0, "GBP"));
            assertEquals(17.2, CurrencyRateCalculator.calculate(100.0, "FRF"));
            assertEquals(58.4, CurrencyRateCalculator.calculate(100.0, "DEM"));
            assertEquals(0.955, CurrencyRateCalculator.calculate(100.0, "JPY"));
    }

    @Test
    void calculateExchangeRatesForInvalidCurrency() {
            assertEquals(0.0, CurrencyRateCalculator.calculate(0.0, "INVALID"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(1.0, "INVALID"));
            assertEquals(0.0, CurrencyRateCalculator.calculate(5.0, "INVALID"));
    }
}