package com.srm.javafullstack;

import java.util.Scanner;

public class stringreverse {
	public void revmethod(String s) {
		String rev="";
		int len=s.length();
		if(len==0) {
			System.out.println("Empty string");
		}
		else {
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		stringreverse ob=new stringreverse();
		ob.revmethod(str);
		
	}
}
