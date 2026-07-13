/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.activity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("         User Account Registration      ");
        System.out.println("========================================");
        System.out.println();

       
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        UserAccount user = new UserAccount(firstName, middleName, lastName,address, email, password);

        System.out.println();
        System.out.println("*** User Account Created ***");
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        input.close();
    }
}