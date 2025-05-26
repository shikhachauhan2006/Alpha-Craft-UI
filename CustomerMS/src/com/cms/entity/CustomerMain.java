package com.cms.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {

		List<Customer> a = new ArrayList<>();
	
	a.add(new Customer("Radha",99,987643));
	a.add(new Customer("Shayam",88,98765));
	a.add(new Customer("Rahul",55,64));
	a.add(new Customer("Prince",33,887));
	System.out.println(a);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 for Sort by Name");
			System.out.println("2 for sort by Id");
			System.out.println("3 for Sort by Phoneno");
			System.out.println("4 for Exit");
			int choice = sc.nextInt();
			
			if(choice==1) {
	 Collections.sort(a, new SortByname());
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
				
				
			}else if(choice==2) {
				Collections.sort( a, new SortByid());
				for(int i=0; i<a.size(); i++) {
					System.out.println(a.get(i));
				}
				
			}else if(choice==3) {
				Collections.sort(a, new SortByphoneNumber());
				for(int i=0; i<a.size(); i++) {
					System.out.println(a.get(i));
				}
			}else if(choice==4){
				System.out.println("!! Exit Successfully !!");
				break;
			}else{
	           System.out.println("Invaild choice");
			}
		}
		}
	}



