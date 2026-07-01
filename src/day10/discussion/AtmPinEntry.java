
package day10.discussion;

import java.util.Scanner;

public class AtmPinEntry {
  
    public static void main(String[] args) {
        // syntax of while Loop
      
        //print your name 10 times using while loop
        
        // Program for ATM PIN Entry
        
        Scanner input = new Scanner(System.in);
        
        int pin = 123456;
        int enteredPin;
        
        System.out.println("Enter your PIN");
        enteredPin = input.nextInt();
        
        while (pin != enteredPin) {
            System.out.println("Incorrect PIN! Try again");
            System.out.print("Enter your PIN: ");
            enteredPin = input.nextInt();
        } 
        System.out.println("Access Granted!");
        input.close();
        
        
        
        
        
        
        
        
        
//        int i = 0;
//        
//        while (i < 10) {
//            System.out.println("Jiyo");
//            i++;
//        }
//int counter = 1;
//        while (true) {
//            System.out.println(": Hello");
//            counter++;
//        }
    }
}