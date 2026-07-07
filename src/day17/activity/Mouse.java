/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.activity;

public class Mouse {
    
    // Attributes
    String brand;
    String color;
    String type;

    // Constructor
    public Mouse(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    // Methods (Behaviors)
    public void point() {
        System.out.println(brand + " mouse is pointing.");
    }

    public void click() {
        System.out.println(brand + " mouse clicking.");
    }

    public void drag() {
        System.out.println(brand + " mouse is dragging an item.");
    }

    // Display object information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}

