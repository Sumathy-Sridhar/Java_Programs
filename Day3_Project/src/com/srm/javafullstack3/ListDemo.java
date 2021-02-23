package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter List Size :");
		int n=sc.nextInt();
		List li=new ArrayList();
		System.out.println("Enter Elements of List :");
		for (int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {

			System.out.println(li.get(i));
		}

	}

}
