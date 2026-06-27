
package day9.discussion;
import java.util.Scanner;


public class Activity5_1_Bernaldez {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = input.nextInt();
        
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
            System.out.println("i = " + i + "sum = " + sum);
        }
        System.out.println("Final Sum: " + sum);
    }
}
