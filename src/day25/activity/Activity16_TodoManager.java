/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AMD Ryzen 5 5600g
 */
public class Activity16_TodoManager {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n ===== TO-DO LIST MENU =====");
            System.out.println("1. Add a tasks");
            System.out.println("2. View all task");
            System.out.println("3. Update tasks");
            System.out.println("4. Remove a tasks");
            System.out.println("5. Clear all tasks");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("==== Add a Task ====");
                    System.out.println("Enter a new tasks: ");
                    String task = scanner.nextLine();
                    tasks.add(task);

                    System.out.println("Task added successfully!");
                    break;

                case 2:

                    System.out.println("===== All Task ====");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nTo-Do List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + " . " + tasks.get(i));
                        }
                    }
                    break;

                case 3:

                    System.out.println("==== Updating Task ====");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to update.");
                    } else {
                        System.out.println("\nCurrent Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {

                            System.out.println(i + " . " + tasks.get(i));
                        }
                        System.out.println("Enter task index to update: ");
                        int updateIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (updateIndex >= 0 && updateIndex < tasks.size()) {
                            System.out.println("Enter the new tasks: ");
                            String newTask = scanner.nextLine();

                            tasks.set(updateIndex, newTask);

                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 4:

                    System.out.println("==== Remove a Task ====");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("\nCurrent Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + " . " + tasks.get(i));
                        }

                        System.out.println("Enter tasks index to remove: ");
                        int removeIndex = scanner.nextInt();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {

                            tasks.remove(removeIndex);

                            System.out.println("Task remove successfully!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 5:

                    tasks.clear();
                    System.out.println("All tasks have been cleared");
                    break;

                case 6:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
