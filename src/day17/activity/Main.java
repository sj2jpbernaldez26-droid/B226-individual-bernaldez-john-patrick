/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.activity;

public class Main {
    public static void main(String[] args) {

        // Instantiate three Mouse objects
        Mouse mouse1 = new Mouse("Logitech", "Black", "Wireless");
        Mouse mouse2 = new Mouse("Razer", "White", "Wireless");
        Mouse mouse3 = new Mouse("HP", "Gray", "Wireless");

        // Display attributes and demonstrate behaviors

        System.out.println("**** Mouse 1 ****");
        mouse1.displayInfo();
        mouse1.point();
        mouse1.click();
        mouse1.drag();

        System.out.println();

        System.out.println("**** Mouse 2 ****");
        mouse2.displayInfo();
        mouse2.point();
        mouse2.click();
        mouse2.drag();

        System.out.println();

        System.out.println("**** Mouse 3 ****");
        mouse3.displayInfo();
        mouse3.point();
        mouse3.click();
        mouse3.drag();
    }
}
