package com.srm.javafullstack3;

import java.util.Comparator;

public class Sortclass implements Comparator<customerdata> {

	@Override
	public int compare(customerdata o1, customerdata o2) {
		int val=o1.getCustomername().compareTo(o2.getCustomername());
		return val;
	}




}
