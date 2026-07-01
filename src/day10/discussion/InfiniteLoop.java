/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        // syntax ffor do while loop
        
       Scanner input = new Scanner(System.in);
       int choice;
       
       
        System.out.println("    [1] Start Game");
        System.out.println("    [2] Load Game");
        System.out.println("    [2] Settings");
        System.out.println("    [4] Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        
       input.close();
    }
}
