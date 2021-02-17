package com.srm.javafullstack;

import java.util.Scanner;

public class Whitespace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String strwhite = str.replaceAll("\\s", ""); 
	    System.out.println("String after removal of whitespaces : "+strwhite); 
	}
}
