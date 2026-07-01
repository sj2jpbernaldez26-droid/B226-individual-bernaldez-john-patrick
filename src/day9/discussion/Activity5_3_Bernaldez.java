
package day9.discussion;

import java.util.Scanner;


public class Activity5_3_Bernaldez {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Starting Number: ");
        int startNumber = input.nextInt();
        
        System.out.println("Enter Common Difference: ");
        int commonDifference = input.nextInt();
        
        System.out.println("Enter Number of Terms: ");
        int n = input.nextInt();
        
        int current = startNumber;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(current);
            sum = sum + current;
            if (i < n) {
                System.out.print(" + ");
            }
            current = current + commonDifference;
        }
        System.out.println(" = " + sum);
    }
}