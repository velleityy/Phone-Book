// Gracie Shull, Shelby Hahn, Elaine Hsu
// CS 145 Java 2 Programming
// 5/12/2022
// Assignment 1: Phone Book

// In the main, it allows the user to do a
// few actions, such as add, delete, update,
// print, and exit with an interactive menu

import java.util.*;

public class PhonebookMain {

    public static void main(String[] args) {
        // initializing manager
        PhonebookManager bellingham = new PhonebookManager();

        Scanner input = new Scanner(System.in);

        System.out.println("This is the phonebook manager!");

        String option = menu(input);

        while (!Objects.equals(option, "5")) {
            switch(option) {
                case "1": // adding a contact
                    System.out.println("Please enter a FIRST name: ");
                    String nameFirst = input.nextLine();

                    System.out.println("Please enter a LAST name: ");
                    String nameLast = input.nextLine();

                    System.out.println("Please enter an address: ");
                    String address = input.nextLine();

                    System.out.println("Please enter a phone number: ");
                    String number = input.nextLine();

                    bellingham.add(nameFirst, nameLast, address, number);
                    break;
                case "2": // deleting a contact
                    System.out.println("Please enter the LAST name you would" +
                            " like to delete: ");
                    nameLast = input.nextLine();

                    bellingham.delete(nameLast);
                    break;
                case "3": // updating a contact
                    System.out.println("Please enter the LAST name you would" +
                            " like to update: ");
                    nameLast = input.nextLine();

                    bellingham.update(nameLast, input);
                    break;
                case "4": // print out the contact list
                    bellingham.printList();
                    break;
                default:
                    break;
            }
            option = menu(input);
        }

        System.out.println(" ");
        System.out.println("Thank you for using our phonebook!");
    } // end main

    public static String menu(Scanner input) {
        System.out.println(" ");
        System.out.println("Please select an option");
        System.out.println("(1) Add an entry to the phonebook");
        System.out.println("(2) Delete an entry in the phonebook");
        System.out.println("(3) Update an entry in the phonebook");
        System.out.println("(4) Print the phonebook");
        System.out.println("(5) Quit");

        return input.nextLine();
    }
} // end class PhonebookMain