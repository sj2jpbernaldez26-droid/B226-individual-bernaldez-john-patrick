/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.overriding;

/**
 *
 * @author AMD Ryzen 5 5600g
 */
public class Main {
    
    public static void main(String[] args) {
        Father father = new Father();
        Husband husband = new Husband();
        Child child = new Child();
        
        father.role();
    }
}
