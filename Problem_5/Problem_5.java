package Problem_5;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem_5 {
    public static void main(String[] args) {
        try (Scanner myscanner = new Scanner(System.in)) {

            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                int num = myscanner.nextInt();
                if (num == -1) {
                    break;
                }
                numbers.add(num);
            }

            double total = 0;
            for (int number : numbers) {
                total += number;
            }
            print("ArrayList: " + numbers);
            print("Total items: " + numbers.size());
            print("Average: " + total / numbers.size());

            // Calculate standard deviation of even numbers
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }

            if (evenNumbers.size() > 0) {
                double evenTotal = 0;
                for (int number : evenNumbers) {
                    evenTotal += number;
                }
                double mean = evenTotal / evenNumbers.size();

                double variance = 0;
                for (int number : evenNumbers) {
                    variance += Math.pow(number - mean, 2);
                }
                variance /= evenNumbers.size();

                double standardDeviation = Math.sqrt(variance);
                String formattedStandardDeviation = String.format("%.2f", standardDeviation);
                print("Standard Deviation of even numbers: " + formattedStandardDeviation);
            } else {
                print("No even numbers to calculate standard deviation.");
            }

            // calculate the sum of the odd numbers
            double sumOfOdd = 0;
            for (int number : numbers) {
                if (number % 2 == 1) {
                    sumOfOdd += number;
                }
            }
            print("Sum of odd numbers: " + sumOfOdd);
        }
    }

    // method to print anything
    static void print(Object anyObject) {
        System.out.println(anyObject);
    }
}
