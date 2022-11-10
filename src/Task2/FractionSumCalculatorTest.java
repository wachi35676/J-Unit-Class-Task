package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionSumCalculatorTest {

    @Test
    void addFractionOneOverTwoPlusOneOverThree() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction expected = new Fraction(5, 6);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusOne() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1);
        Fraction expected = new Fraction(3, 2);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusZero() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction();
        Fraction expected = new Fraction(1, 2);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusOneOverTwo() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Fraction expected = new Fraction(4,4);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusOneOverFour() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 4);
        Fraction expected = new Fraction(6, 8);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusOneOverSix() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 6);
        Fraction expected = new Fraction(8, 12);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    //add negative fractions
    @Test
    void addFractionOneOverTwoPlusNegativeOneOverTwo() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(-1, 2);
        Fraction expected = new Fraction(0,4);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void addFractionOneOverTwoPlusNegativeOneOverFour() {
        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(-1, 4);
        Fraction expected = new Fraction(2, 8);
        Fraction actual = calculator.addFraction(a, b);
        assertEquals(expected, actual);
    }
}