
package day10.discussion;

import java.util.Scanner;
public class Activity6_1_Bernaldez {
  // Import Scanner to get user input

    public static void main(String[] args) {
        // Create Scanner object
        Scanner scan = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter the number for the multiplication table: ");
        int num = scan.nextInt();

        // Print title
        System.out.println("\n--- Multiplication Table of " + num + " ---");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scan.close(); // Close scanner
    }
}  
