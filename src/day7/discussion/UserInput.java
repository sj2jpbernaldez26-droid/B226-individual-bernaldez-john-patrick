
package day7.discussion;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        // instantiation / Create and object of Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = input.nextLine(); // String input
        
        System.out.println("Enter age: ");
        int age = input.nextInt(); // int input
        
        System.out.println("Enter salary: ");
        double salary = input.nextDouble(); // Double input
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salry: " + salary);
    }
}
