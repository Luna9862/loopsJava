package org.example;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break; // End the loop if the number is 0
            } else if (number < 0) {
                System.out.println("Number must be positive");
            } else {
                System.out.println("Number is " + number);
            }
        }
    }
}
