/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

/**
 *
 * @author Administrator
 */
public class Ballpen {
    // Private fields (encapsulation)
    private int id;
    private String brand;
    private String color;
    private double price;
    private double pointSize;

    // Constructor (optional, but good practice)
    public Ballpen() {
        // Default constructor
    }

    // Parameterized constructor (if you want to set values directly)
    public Ballpen(int id, String brand, String color, double price, double pointSize) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.pointSize = pointSize;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    public int getID() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getPointSize() {
        return pointSize;
    }
}
