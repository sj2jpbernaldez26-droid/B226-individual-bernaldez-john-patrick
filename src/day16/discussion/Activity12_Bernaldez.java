/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16.discussion;

public class Activity12_Bernaldez {
     // Check odd/even
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

    // Print name 50x
    public static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("John Patrick D Bernaldez");
        }
    }

    // Square root
    public static double getSquareRoot(double num) {
        double answer = Math.sqrt(num);
        return answer;
    }

    // Power
    public static double getPower(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }

    // Random number
    public static int getRandomNumber() {
        int random = (int)(Math.random() * 100) + 1;
        return random;
    }

    // Circle area
    public static double getCircleArea(double radius) {
        double area = 3.1416 * radius * radius;
        return area;
    }

    // Voter check
    public static boolean isVoter(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Word length
    public static int getWordLength(String word) {
        int length = word.length();
        return length;
    }

    // Reverse word
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

    // Info
    public static void showMyInfo() {
        System.out.println("Full Name: John Patrick D Bernaldez");
        System.out.println("Age: 24");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println("The number 45 is: " + checkOddEven(45));
        System.out.println("The square root of 64 is: " + getSquareRoot(64));
        System.out.println("2 to the 5th power: " + getPower(2,5));
        System.out.println("Random number: " + getRandomNumber());
        System.out.println("Area (r=5): " + getCircleArea(5));
        System.out.println("can 17yr.old vote?: " + isVoter(17));
        System.out.println("Length of 'Programming': " + getWordLength("Programming"));
        System.out.println("Reverse 'JAVA': " + reverseWord("JAVA"));
        
        printName50Times();
        showMyInfo();
    }
}
