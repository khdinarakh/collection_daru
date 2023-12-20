package com.company.telephone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberInfo {
    private static Map<String, String> phoneBook = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Get all contacts");
            System.out.println("3. Update info");
            System.out.println("4. Search by name");
            System.out.println("5. Exit");
            System.out.print("Choose correct answer: ");

            int userChoice = scanner.nextShort();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    printAllContact();
                    break;
                case 3:
                    updateName();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("wrong");
            }
        }

    }

    private static void addContact() {
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your phone number: ");
        String number = scanner.nextLine();

        phoneBook.put(name, number);
        System.out.println("successful!");
    }

    private static void printAllContact() {
        if (phoneBook.isEmpty()) {
            System.out.println("Empty contact");
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private static void updateName() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Change number: ");
            String newNumber = scanner.nextLine();
            phoneBook.put(name, newNumber);
            System.out.println("successful");
        } else
            System.out.println("not found!");
    }

    private static void search() {
        System.out.println("Input name to find number:");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Name: " + name + ": " + phoneBook.get(name));
        } else
            System.out.println("Not found!");
    }
}
