package day11.discussion;

import java.util.Scanner;

public class Activity7_Bernaldez {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare an array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;
        double average;

        // Ask the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }

        // Display all the numbers entered
        System.out.println("\nYou entered:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Compute the average
        average = (double) sum / 5;

        // Display the sum and average
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Find the highest and lowest numbers
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < 5; i++) {

            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Display the highest and lowest numbers
        System.out.println("Highest Number = " + highest);
        System.out.println("Lowest Number = " + lowest);

        input.close();
    }
}