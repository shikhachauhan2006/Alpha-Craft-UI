package com.cms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        int choice;

        do {
            System.out.println("\n==== Country-Capital Menu ====");
            System.out.println("1. Add Country and Capital");
            System.out.println("2. Search Capital by Country");
            System.out.println("3. Update Capital");
            System.out.println("4. Delete Country");
            System.out.println("5. View All Entries");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1: // Add
                    System.out.print("Enter Country: ");
                    String country = scanner.nextLine();
                    System.out.print("Enter Capital: ");
                    String capital = scanner.nextLine();

                    if (map.containsKey(country)) {
                        System.out.println("Country already exists.");
                    } else {
                        map.put(country, capital);
                        System.out.println("Added successfully.");
                    }
                    break;

                case 2: // Search
                    System.out.print("Enter Country to search: ");
                    String searchCountry = scanner.nextLine();
                    if (map.containsKey(searchCountry)) {
                        System.out.println("Capital of " + searchCountry + ": " + map.get(searchCountry));
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter Country to update: ");
                    String updateCountry = scanner.nextLine();
                    if (map.containsKey(updateCountry)) {
                        System.out.print("Enter new Capital: ");
                        String newCapital = scanner.nextLine();
                        map.put(updateCountry, newCapital);
                        System.out.println("Capital updated.");
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter Country to delete: ");
                    String deleteCountry = scanner.nextLine();
                    if (map.containsKey(deleteCountry)) {
                        map.remove(deleteCountry);
                        System.out.println("Country removed.");
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;

                case 5: // View All
                    if (map.isEmpty()) {
                        System.out.println("No entries found.");
                    } else {
                        System.out.println("Country -> Capital List:");
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}

