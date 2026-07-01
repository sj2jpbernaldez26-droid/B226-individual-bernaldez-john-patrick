package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {
    /*
            Age: 0 - 12 -> Child 
                Age: 0 - 5 ->  Specifically, Toddler
                Age: 6 - 12 ->  Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13 - 15 ->  Specifically, Eary Teen
                Age: 16 - 19 ->  Specifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20 - 35 ->  Specifically, Young Adult
                Age: 36 - 59 ->  Specifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60 - 75 ->  Specifically, Young Senior
                Age: 76 - 120 ->  Specifically, Elderly
            Invalid Age -> Invalid Input
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age =input.nextInt();
        
        if (age >= 0 && age <= 120) {

            if (age <= 12) { // 0 - 12
                System.out.println("You are a child");
                if (age <= 5) {
                    System.out.println("Specifically, your are Toddler");
                } else {
                    System.out.println("Specifically, your are Toddler");
                }
            } else if (age <= 19) { // 13 - 19
                System.out.println("You are teenager");
                if (age <= 15) {
                    System.out.println("Specifically, you are Ealy Teen");
                } else {
                    System.out.println("Specifically, you are Late Teen");
                }
            } else if (age <= 59) { // 20 - 59
                System.out.println("You are adult");
                if (age <= 35) {
                    System.out.println("Specifically, you are Young Adult");
                } else {
                    System.out.println("Specifically, you are Middle Age");
                }
            } else if (age <= 120) { // 60 - 120
                System.out.println("You are senior citizen");
                if (age <= 75) {
                    System.out.println("Specifically, you are Young Senior");
                } else {
                    System.out.println("Specifically, you are Elderly");
                }
            } else {
                System.out.println("Invalid age entered.");
            }

        } else {
            System.out.println("Invalid Age Enter");
        }

        
        
            
            input.close();
        }
    }