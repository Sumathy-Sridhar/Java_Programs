package com.srm.javafullstack3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashmapSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t Sorting of HashMap \n");
		System.out.println("Enter size of Hashmap: ");
		int size=sc.nextInt();
		LinkedHashMap linkhashmap=new LinkedHashMap();
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter key:");
		Integer a = sc.nextInt();
		System.out.println("Enter value:");
		        String b = sc.next();
		        linkhashmap.put(a, b);
		}
		   System.out.println("Hashmap Before Sorting: "+linkhashmap);
		   HashMap hmap=new HashMap();
		   hmap.putAll(linkhashmap);
		   System.out.println("Hashmap After sorting: "+hmap);
	}
}

