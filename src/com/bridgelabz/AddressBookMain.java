package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System");
        Contacts contact = new Contacts();
        contact.setFirstName("Sudha");
        System.out.println(contact.getFirstName());
    }
}
