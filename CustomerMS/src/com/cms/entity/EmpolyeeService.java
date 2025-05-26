package com.cms.entity;

import java.util.HashSet;

public class EmpolyeeService {
	 public static void main(String[] args) {
		HashSet<EmployeeEntity> s = new HashSet<>();
		
		EmployeeEntity emp1 = new EmployeeEntity("Kashh","Finanace");
		EmployeeEntity emp2 = new EmployeeEntity("Rohit","IT");
		EmployeeEntity emp3 = new EmployeeEntity("Rohit","IT");
		s.add(emp1);
		s.add(emp2);
		s.add(emp3);
		
		//System.out.println("All Employee");
		for(EmployeeEntity empf : s) {
			System.out.println(empf);
		}
	}
	 
		
}
 