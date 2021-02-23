package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CoversionLinkArray {

	public static void main(String[] args) {
		LinkedList<String> Mylinkedlist = new LinkedList<String>();
		System.out.println("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Enter the LinkedList Values : ");
		for (int i=0;i<n;i++) {
			Mylinkedlist.add(sc.next());
		}
		System.out.println("LinkedList values : ");
		for(int i=0;i<n;i++) {
			System.out.println(Mylinkedlist.get(i));
		}
		 List<String> list = new ArrayList<String>(Mylinkedlist);
		 System.out.println("After Coversion of LinkedList to ArrayLsit: ");
		    for (String str : list){
		      System.out.println(str);
	}
}
}	
