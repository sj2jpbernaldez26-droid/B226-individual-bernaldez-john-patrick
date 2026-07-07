/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15.discussion;


public class Activity11_Bernaldez {
     public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {

            int number = (int)(Math.random() * 58) + 1;
            boolean duplicate = true;

            while (duplicate) {
                duplicate = false;
                
                // Check if the number already exists
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == number) {
                        number = (int)(Math.random() * 58) + 1;
                        duplicate = true;
                    }
                }
            }

            lotto[i] = number;
        }

        System.out.println("Lotto Numbers:");

        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
