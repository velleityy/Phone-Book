// Gracie Shull, Shelby Hahn, Elaine Hsu
// CS 145 Java 2 Programming
// 5/12/2022
// Assignment 1: Phone Book

// In the phone book node, it simply contains
// out contructors and get/set methods
// for our manager.

public class PhonebookNode {

    // change to private
    private String nameFirst;
    private String nameLast;
    private String address;
    private String number;
    private PhonebookNode next;

    //creates a new node to store info and no next node
    public PhonebookNode(String nameFirst, String nameLast,
                         String address, String number) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.address = address;
        this.number = number;
        this.next = null;
    }

    // get methods, doesnt change the value
    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public PhonebookNode getNext() {
        return next;
    }

    // set methods, changes the values
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNext(PhonebookNode next) {
        this.next = next;
    }
}