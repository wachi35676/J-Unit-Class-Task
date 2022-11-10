package Task2;

import java.util.Scanner;

public class Main {
    FractionSumCalculator calculator = new FractionSumCalculator();

    public static void main(String[] args) {
        //take input from user of two fraction and then call the add function
        //after that print the result

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numerator of first fraction:");
        int num1 = sc.nextInt();
        System.out.println("Enter Denominator of first fraction:");
        int den1 = sc.nextInt();

        System.out.println("Enter Numerator of second fraction:");
        int num2 = sc.nextInt();
        System.out.println("Enter Denominator of second fraction:");
        int den2 = sc.nextInt();

        Fraction a = new Fraction(num1, den1);
        Fraction b = new Fraction(num2, den2);

        FractionSumCalculator calculator = new FractionSumCalculator();
        Fraction result = calculator.addFraction(a, b);

        System.out.println("The sum of the two fractions is: " + result);

    }
}
