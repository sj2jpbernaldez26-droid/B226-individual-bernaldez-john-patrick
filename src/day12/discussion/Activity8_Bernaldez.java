package day12.discussion;

import java.util.Scanner;

public class Activity8_Bernaldez {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //print title
        System.out.println("\n======================================");
        System.out.println("         Average Calculator             ");
        System.out.println("======================================\n");

        // getting input from the user
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();
        input.nextLine(); // adding new line

        // Input subject names
        System.out.println("\nEnter subject names:");
        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = input.nextLine();
        }

        // Storing data
        String[] names = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        // Input student data
        for (int s = 0; s < numStudents; s++) {
            System.out.println("\nName of Student " + (s + 1) + ": ");
            names[s] = input.nextLine();
            System.out.println("Enter grades for each subject:");

            double total = 0;
            for (int g = 0; g < numSubjects; g++) {
                System.out.print(subjects[g] + ": ");
                grades[s][g] = input.nextDouble();
                total += grades[s][g];
            }
            averages[s] = total / numSubjects; // getting the average of each student
            input.nextLine(); 
        }

        // Grades Report Table title
        System.out.println("\n=======================================");
        System.out.println("           Grades Report                ");
        System.out.println("=======================================\n");

        System.out.printf("%-10s", "Student");
        for (String sub : subjects) {
            System.out.printf("%-12s", sub);
        }
        System.out.printf("%-10s%n", "Average");
        System.out.println("----------------------------------------");

        // Table Rows
        for (int s = 0; s < numStudents; s++) {
            System.out.printf("%-10s", names[s]);
            for (int g = 0; g < numSubjects; g++) {
                System.out.printf("%-12.0f", grades[s][g]);
            }
            System.out.printf("%-10.2f%n", averages[s]);
        }

        input.close();
    }
}