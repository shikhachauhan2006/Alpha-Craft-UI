package com.cms.entity;

public class Customer {
	public Customer(String name, int id, int phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}
	private String name;
	private int id;
	private int phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Customer Name = " + name + "!! Id = " + id + "!! Phone Number = " + phoneNumber + "\n";
	}
	

	
	

}
