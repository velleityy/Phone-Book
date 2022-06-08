// Gracie Shull, Shelby Hahn, Elaine Hsu
// CS 145 Java 2 Programming
// 5/12/2022
// Assignment 1: Phone Book

// In this phone book manager, it allows the user to either add
// an entry (name, phone #) to the end  You can also
// modify the entry, delete entries, or move them from the
// Bellingham to the Graham phone book. You should also
// be able to print out your list in a nice format.

import java.util.*;

public class PhonebookManager {

    private PhonebookNode front;

    // adds node at the end of phonebook
    public void add(String nameFirst, String nameLast,
                    String address, String number) {

        // set the given node to a new node
        PhonebookNode newNode = new PhonebookNode(nameFirst, nameLast, address, number);

        newNode.setNameFirst(nameFirst);
        newNode.setNameLast(nameLast);
        newNode.setAddress(address);
        newNode.setNumber(number);

        if (front == null) {
            // sets the start of the list
            front = new PhonebookNode(nameFirst, nameLast, address, number);
            return;
        }
        // makes the next node null
        newNode.setNext(null);

        // starts at the front and goes through till it reaches the end
        PhonebookNode current = front;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // Change the next of last node
        current.setNext(newNode);
    }

    // deletes a node by last name
    public void delete(String nameLast) {
        // Store head node
        PhonebookNode temp = front;
        PhonebookNode prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && Objects.equals(temp.getNameLast(), nameLast)) {
            front = temp.getNext(); // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && !Objects.equals(temp.getNameLast(), nameLast)) {
            prev = temp;
            temp = temp.getNext();
        }

        // If key was not present in linked list
        if (temp == null) {
            return;
        }

        // Unlink the node from linked list
        assert prev != null;
        prev.setNext(temp.getNext());
    }

    public void update(String key, Scanner input) {

        PhonebookNode contact = front;

        if (front == null) {
            System.out.println("There is no contacts to update.");
            return;
        }

        // If head node itself holds the key to be deleted
        while (contact != null && !Objects.equals(contact.getNameLast(), key)) {
            contact = contact.getNext();
        }

        // If key was not present in linked list
        if (contact == null) {
            System.out.println("Contact was not found.");
            return;
        }

        System.out.println("Enter your UPDATED first name: ");
        contact.setNameFirst(input.nextLine());
        System.out.println("Enter your UPDATED last name: ");
        contact.setNameLast(input.nextLine());
        System.out.println("Enter your UPDATED address: ");
        contact.setAddress(input.nextLine());
        System.out.println("Enter your UPDATED number: ");
        contact.setNumber(input.nextLine());
    }

    // prints out the phonebook
    public void printList() {
        PhonebookNode tnode = front;

        while (tnode != null) {
            System.out.print("\n" + tnode.getNameLast() + ", " + tnode.getNameFirst() +
                    "\nAddress: " + tnode.getAddress() +
                    "\nCity: Bellingham" +
                    "\nPhone number: " + tnode.getNumber() + "\n");
            tnode = tnode.getNext();
        }
    }
}