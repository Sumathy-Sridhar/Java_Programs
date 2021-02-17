package com.srm.javafullstack;

import java.util.Scanner;

public class Factorial {
	public void Facto(int num) {
		if(num<0) {
			System.out.println("Negative numbers not allowed");
		}else {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+ " is " +fact);
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorial ft=new Factorial();
		ft.Facto(num);
		}
}
