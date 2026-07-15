/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

import java.util.Scanner;


public class SingleDimensionalArray {
    
    public static void main(String[] args) {
        // syntax for single dimensional array
        // collections of ages: 24 43 35 18 28 25
        //            0   1    2   3
        int[] ages = {24, 43, 35, 18, 28, 25};
        // Traverse an ages array using for loop and for-each loop.
        
        
        
        
        //System.out.println(ages[2]);
        

        String[] names = {"Michael", "Les", "Kent", "Ray", "Kent", "Winter"}; 
        //System.out.println(names.length -1);
       
        // maximum index
        
        // Traversing an array using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        
        // Traversing an array using for-each loop / enhanced for loop
//        for (String name : names) {
//            System.out.println(name);
//        }
        
        

        // Array Declaration with specified size only
        Scanner scanner = new Scanner(System.in);
        
        
        String[] anime = new String[5];

        for (int i = 0; i < anime.length; i++) {
            System.out.print("Enter anime title: ");
            anime[i] = scanner.nextLine();
        }
        
        
        System.out.println("\nAnime you entered: ");
        for (String title : anime) {
            System.out.println(title);
        }
        
    }
}
