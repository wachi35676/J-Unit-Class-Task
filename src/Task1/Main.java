package Task1;

import java.util.Scanner;

public class Main {
    CurrencyRateCalculator calculator = new CurrencyRateCalculator();

    public static void main(String[] args) {
        //take user input for amount and currency
        //call calculator.calculate(amount, currency)
        //print result

        int choice = 0;
        double amount = 0.0;
        String currency = "";
        double result = 0.0;

        System.out.println("Welcome to the Currency Rate Calculator!");
        System.out.println("1. Calculate exchange rates for GBP");
        System.out.println("2. Calculate exchange rates for FRF");
        System.out.println("3. Calculate exchange rates for DEM");
        System.out.println("4. Calculate exchange rates for JPY");
        System.out.println("0. Exit");
        System.out.println("Please select an option:");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> currency = "GBP";
            case 2 -> currency = "FRF";
            case 3 -> currency = "DEM";
            case 4 -> currency = "JPY";
            case 0 -> System.exit(0);
            default -> System.out.println("Invalid choice!");
        }

        System.out.println("Please enter the amount:");
        amount = scanner.nextDouble();

        result = CurrencyRateCalculator.calculate(amount, currency);

        System.out.println("The result is: " + result);

    }
}