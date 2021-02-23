package com.srm.javafullstack3;

import java.util.Comparator;

public class SortByAge implements Comparator <CustomerDetails> {
	@Override
	public int compare(CustomerDetails c3, CustomerDetails c4) {
	String a1=String.valueOf(c3.getAge());
	String a2=String.valueOf(c4.getAge());
	int es=a1.compareTo(a2);
	return es;
	}

}
