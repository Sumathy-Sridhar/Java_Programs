package com.srm.javafullstack;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest {
	public void seclarge(int[] arr,int n) {
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Second Largest Number: " +arr[n-2]);
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
	    SecondLargest sl=new SecondLargest();
	    sl.seclarge(arr,n);
		
	}

}
