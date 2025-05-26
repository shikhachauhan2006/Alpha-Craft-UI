package com.cms.entity;
import java.util.*;
public class MenuDrivenProgram {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashSet<String> hashSet = new HashSet<>();

	        int choice;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Add element");
	            System.out.println("2. Display elements (unsorted)");
	            System.out.println("3. Display elements (sorted)");
	            System.out.println("4. Remove element");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to add: ");
	                    String elementToAdd = sc.nextLine();
	                    if (hashSet.add(elementToAdd)) {
	                        System.out.println("Element added.");
	                    } else {
	                        System.out.println("Element already exists.");
	                    }
	                    break;

	                case 2:
	                    System.out.println("Unsorted elements (HashSet): " + hashSet);
	                    break;

	                case 3:
	                    TreeSet<String> treeSet = new TreeSet<>(hashSet);
	                    System.out.println("Sorted elements (TreeSet): " + treeSet);
	                    break;

	                case 4:
	                    System.out.print("Enter element to remove: ");
	                    String elementToRemove = sc.nextLine();
	                    if (hashSet.remove(elementToRemove)) {
	                        System.out.println("Element removed.");
	                    } else {
	                        System.out.println("Element not found.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}



