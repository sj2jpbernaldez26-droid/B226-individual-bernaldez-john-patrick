
package day9.discussion;

import java.util.Scanner;

public class Activity5_4_Bernaldez {
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
        long product = 1;
        
        System.out.println("Sum: ");
        
        for (int i = 1; i <= n; i++) {
        
        System.out.print(current);
        product = product * current;
        
        if (i < n) {
            System.out.println(" + ");
        }
        current = current + commonDifference;
    }
        System.out.println(" = " + product);
    }
}
