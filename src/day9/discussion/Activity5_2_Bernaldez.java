
package day9.discussion;

import java.util.Scanner;

public class Activity5_2_Bernaldez {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter N: ");
        int n = input.nextInt();
        
        int product = 1;
        
        for (int i = 1; i <= n; i++) {
            product = product * i;
            System.out.println("i + " + i + ",product = " + product);
            
        }
        System.out.println("Final Product: " + product);
    }
}
