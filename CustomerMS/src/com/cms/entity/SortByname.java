package com.cms.entity;

import java.util.Comparator;

public class SortByname implements Comparator<Customer>{
	public int compare(Customer a, Customer b) {
		return a.getName().compareTo(b.getName());
	}
}
