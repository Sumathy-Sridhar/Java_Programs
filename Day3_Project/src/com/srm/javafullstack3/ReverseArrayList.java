package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
	static void reverse(ArrayList a) 
    { 
        Collections.reverse(a); 
        System.out.println(a); 
    } 
	
	
public static void main(String[] args) {
		ArrayList als=new ArrayList();
		System.out.println("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for (int i=0;i<n;i++) {
			als.add(sc.nextInt());
		}
		System.out.println("ArrayList :");
		for(int i=0;i<n;i++) {
			System.out.println(als.get(i));
		}
	System.out.println("ArrayList after Reversing :");
	reverse(als);
	
	}

}
