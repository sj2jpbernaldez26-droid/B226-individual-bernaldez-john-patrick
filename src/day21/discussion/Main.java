/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

public class Main {
    public static void main(String[] args) {
        // Create Ballpen object
        Ballpen ballpen = new Ballpen();

        // Assign values using setters
        ballpen.setBrand("Pilot");
        ballpen.setColor("Black");
        ballpen.setPrice(15);
        ballpen.setPointSize(0.5);

        // Display values using getters
        System.out.println(ballpen.getBrand());
        System.out.println(ballpen.getColor());
        System.out.println(ballpen.getPrice());
        System.out.println(ballpen.getPointSize());
    }
}
