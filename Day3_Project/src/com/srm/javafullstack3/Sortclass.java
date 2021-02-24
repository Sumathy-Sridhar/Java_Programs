package com.srm.javafullstack3;

import java.util.Comparator;

public class Sortclass implements Comparator<customerdatasort> {

	@Override
	public int compare(customerdatasort o1, customerdatasort o2) {
		int val=o1.getCustomername().compareTo(o2.getCustomername());
		return val;
	}




}
