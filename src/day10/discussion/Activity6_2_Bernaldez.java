/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

/**
 *
 * @author Administrator
 */
public class Activity6_2_Bernaldez {
    public static void main(String[] args) {
        // Outer loop = which table
        for(int table = 1; table <= 10; table++){
            System.out.println("\n=== Multiplication Table of " + table + " ===");
            // Inner loop = multiply 1 to 10
            for(int i = 1; i <= 10; i++){
                System.out.println(table + " x " + i + " = " + (table * i));
            }
        }
    }
}

