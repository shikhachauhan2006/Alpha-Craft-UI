package com.cms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> a1 = new HashSet<>(Arrays.asList(10,66,44,6,8,3,2,0,88));
		Set<Integer> a2 = new HashSet<>(Arrays.asList(10,100,1000,10000,66,8));
		
		Set<Integer> union = new HashSet<>(a1);
		union.addAll(a2);
		System.out.println("Display All Elements Both Set" +union);
		
		Set<Integer> Common = new HashSet<>(a1);
		Common.retainAll(a2);
		System.out.println("Common Element Both Set" + Common);
		
		Set<Integer> Different1 = new HashSet<>(a1);
		Different1.removeAll(a1);
		
		Set<Integer> Different2 = new HashSet<>(a2);
		Different2.removeAll(a2);
		System.out.println("Element Exist in a1 but not a2" +Different1);
		System.out.println("Element Exist in a2 but not a1" +Different2);
	}

}
