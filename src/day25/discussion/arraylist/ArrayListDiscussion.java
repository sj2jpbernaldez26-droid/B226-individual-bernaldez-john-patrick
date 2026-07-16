/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion.arraylist;

import java.util.ArrayList;

public class ArrayListDiscussion {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Izuzu");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Bugatti");
        cars.add("Toyota");
        cars.add(1, "Lightning McQueen");
        
//        System.out.println(cars.get(0));
//        System.out.println(cars.get(cars.size() -1));
        
        cars.set(1, "McQueen");
        
        cars.remove(1);
        cars.remove("Toyota");
        
        cars.clear();
        System.out.println(cars);
    }
}
/*
CRUD Operation
    Create -> add()
    Read -> get()
    Update -> set()
    Delete -> remove()
    
    Delete All -> removeAll() / clear()
*/