/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22.discussion;

public class Main {
    
    public static void main(String[] args) {
        Admin admin = new Admin("Winter", "winter@gmail.com", "winter123", "Admin", "IT");
        System.out.println(admin.getRoleInfo());
        StandardUser user = new StandardUser("Summer", "summer@gmail.com", "summer123", "Standard User", "Joysis Tech Voc.");
        System.out.println(user.getRoleInfo());
        
        
        System.out.println("Comapny Name: " + user.companyName);
    }
}
