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
public class Child extends Person {
    @Override
    public void role(){
        System.out.println("I am a Child");
    }
        
}
