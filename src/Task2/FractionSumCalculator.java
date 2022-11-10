package Task2;

public class FractionSumCalculator {
    public Fraction addFraction(Fraction a, Fraction b) {
        int numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        int denominator = a.denominator * b.denominator;
        return new Fraction(numerator, denominator);
    }
}
