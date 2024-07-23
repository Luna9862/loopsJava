package org.example;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Ask for a number less than 11
        do {
            System.out.println("Enter a number less than 11: ");
            number = scanner.nextInt();
        } while (number >= 11);

        // Print numbers from the entered number up to 11
        for (int i = number; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
