package com.srm.javafullstack;

import java.util.Scanner;

public class OddArrayList {
	public void oddarray(int[] arr, int n) {
		int ctr=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				ctr++;
			}
		}
		if(ctr>=1) {
			System.out.println(ctr+ " Odd Integers are in the Array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Array Values: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		OddArrayList od=new OddArrayList();
		od.oddarray(arr,n);

	}

}
