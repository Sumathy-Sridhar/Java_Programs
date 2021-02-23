package com.srm.javafullstack3;

import java.util.Comparator;

public class SortByName implements Comparator <CustomerDetails> {
	public int compare(CustomerDetails c1, CustomerDetails c2) {
		int res=c1.getName().compareTo(c2.FirstName);
		return res;
		}


}
