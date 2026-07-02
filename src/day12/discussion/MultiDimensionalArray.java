/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12.discussion;

/**
 *
 * @author Administrator
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        // syntax on how to declare a muti-dimensional array
        
        String [][] colors = { 
            // 0         1        2
            {"white", "yellow", "pink"}, //0
            {"black", "brown", "gray"},  // 1
            {"green"} //2
        };
        
        // coordinates      [row][column]
//        System.out.println(colors[0][1]);
//        
//        System.out.println(colors[2].length);

//        Traverse a multi-dimensional arrayy using nested for loop
//
//            for (int i = 0; i < colors.length; i++) { // outer loop
//                for (int j = 0; j < colors[i].length; j++) {
//                    System.out.println(colors[i][j]);
//                }
//                System.out.println(""); // new line
//        }
//        
            
            // Printing a muti-dimesional array using neested for each loop
            for (String[] row : colors) {
                for (String column : row) {
                    System.out.println(column);
                }
                System.out.println("");
    }
    }
}
