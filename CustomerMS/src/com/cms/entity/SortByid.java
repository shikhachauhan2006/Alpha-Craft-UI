package com.cms.entity;

import java.util.Comparator;

public class SortByid implements Comparator<Customer> {
	public int compare(Customer x, Customer y) {
		return x.getId()-(y.getId());
		}
	

}
