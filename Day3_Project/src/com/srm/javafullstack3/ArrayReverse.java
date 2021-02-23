package com.srm.javafullstack3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayReverse {
	static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
	

	public static void main(String[] args) {
		Integer [] arr= {20,90,60,45,33,1};
		reverse(arr);
		
		
		
	}

}
