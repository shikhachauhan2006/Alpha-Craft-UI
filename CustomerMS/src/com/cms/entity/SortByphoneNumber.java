package com.cms.entity;

import java.util.Comparator;

public class SortByphoneNumber implements Comparator<Customer> {
	public int  compare(Customer n, Customer m) {
		return n.getPhoneNumber()-(n.getPhoneNumber());
	}

}
