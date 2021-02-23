package com.src.javafullstack4;

import java.util.Comparator;

public class Sortclass implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int val=o1.getCustomername().compareTo(o2.getCustomername());
		return val;
	}
	

}
