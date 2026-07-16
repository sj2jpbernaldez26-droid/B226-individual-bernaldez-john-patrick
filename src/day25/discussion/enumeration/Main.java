/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion.enumeration;

public class Main {
    
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDA
}
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        
        if (today == Day.MONDAY || today == Day.TUESDAY) {
            System.out.println("Strart of the week");
        }else if (today == Day.WEDNESDAY || today == Day.THURSDAY){
            System.out.println("It's midweek");
        }else if (today == Day.FRIDAY){
            System.out.println("Weekend is near");
        }else {
            System.out.println("Weekend!");
        }
    }
}
