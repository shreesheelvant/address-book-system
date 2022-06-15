

package com.brigelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBookSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact[] contacts = new Contact[3];

    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please select options\n1. add contact\n2. edit contact\n3. delete contact\n4. exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addContact();
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 2:
                    System.out.println("Enter name to edit");
                    String name = scanner.nextLine();
                    int contactIndex = findContactByName(name);
                    System.out.println(contactIndex);
                    if (contactIndex == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        Contact contact = editContact(contacts[contactIndex]);
                        contacts[contactIndex] = contact;
                    }
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    name = scanner.nextLine();
                    int contactIndexForDelete = findContactByName(name);
                    if (contactIndexForDelete == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        contacts[contactIndexForDelete] = null;
                    }
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 4:
                    isExit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please select valid input");
            }
        }
//        System.out.println("Welcome to address book");
//        Contact contact = addContact();
//        System.out.println(contact);
//        Contact editedContact = editContact(contact);
//        System.out.println(editedContact);
    }

    private static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first name:");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter address:");
        contact.setAddress(scanner.nextLine());
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                System.out.println("Contact added successfully");
                return contact;
            }
        }
        System.out.println("No space for new contact");
        return contact;
    }

    private static Contact editContact(Contact contact) {
        System.out.println("Edit first name");
        contact.setFirstName(scanner.nextLine());
        return contact;
    }

    private static int findContactByName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getFirstName().equals(name) ||
                        contacts[i].getLastName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }
}