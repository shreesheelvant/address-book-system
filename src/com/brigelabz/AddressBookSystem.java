package com.brigelabz;
import java.util.Scanner;
public class AddressBookSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Contact contact = addContact();
        System.out.println(contact);
    }

    private static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first name:");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name:");
        contact.setLastName(scanner.next());
        System.out.println("Enter address:");
        contact.setAddress(scanner.next());
        System.out.println("Enter city:");
        contact.setCity(scanner.next());
        System.out.println("Enter state:");
        contact.setState(scanner.next());
        System.out.println("Enter email:");
        contact.setEmail(scanner.next());
        System.out.println("Enter phoneNumber:");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Enter zipCode:");
        contact.setZipCode(scanner.next());

        return contact;

    }
}