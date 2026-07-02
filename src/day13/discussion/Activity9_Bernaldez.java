/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13.discussion;

public class Activity9_Bernaldez {
    
    public static void main(String[] args) {

        String country = "Philippines";

        //Display first and last character
        System.out.println("First Character: " + country.charAt(0));
        System.out.println("Last Character: " + country.charAt(country.length() - 1));

        // Count P or p
        int countP = 0;

        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'P' || country.charAt(i) == 'p') {
                countP++;
            }
        }

        System.out.println("Number of P/p: " + countP);

        // Count vowels
        int vowels = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = country.charAt(i);

            if (letter == 'a' || letter == 'A' ||
                letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' ||
                letter == 'o' || letter == 'O' ||
                letter == 'u' || letter == 'U') {

                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        
        //contains() -> Checks if a string contains a specified sequence of characters. Returns true or false.
            //    String str = "Hello Java"; 
           // System.out.println(str.contains("Java")); // true
            
        // endsWith() -> Checks if a string ends with the specified suffix.
           //     String str = "Programming";
           // System.out.println(str.endsWith("ing")); // true
           
        // startsWith() -> Checks if a string starts with the specified prefix.
            //    String str = "Programming";
            //System.out.println(str.startsWith("Pro")); // true
            
        // indexOf() -> Returns the position of the first occurrence of a character or substring.
            // String str = "Hello";
            //System.out.println(str.indexOf("e")); // 1
            
        //isEmpty() -> Checks whether the string is empty.
            //  String str = "";
            //System.out.println(str.isEmpty()); // true
        
        // trim() -> Removes spaces at the beginning and end of a string.
        //String str = " Hello ";
        //System.out.println(str.trim()); // Hello
        
        //replace() -> Replaces characters or strings with another value.
        // String str = "Java";
        // System.out.println(str.replace("a","o")); // Jovo
        
        // toCharArray() -> Converts a string into a character array.
        // String str = "Java"; char[] ch = str.toCharArray(); for(char c : ch){ 
        // System.out.print(c + " "); 
        //}
        
        // nextLine().charAt() -> Reads a whole line from the user and gets a character at a specific position.
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a word: "); 
        //char ch = sc.nextLine().charAt(0); 
        //System.out.println(ch);
        
        // valueOf() -> Converts different data types into a String.
        //int num = 100;
        //String str = String.valueOf(num);
        //System.out.println(str);
        
    }
}




