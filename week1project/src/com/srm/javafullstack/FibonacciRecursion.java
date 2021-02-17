package com.srm.javafullstack;

import java.util.Scanner;

public class FibonacciRecursion {
	static int a=0,b=1,c=0;
		static void fib(int num)
		{
		if(num>0)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(" "+c);
		fib(num-1);
		}
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("FIBONACCI SERIES USING RECURSION \n\n"+"Enter the number: ");
		int num=sc.nextInt();
		System.out.println(" "+a+" \n"+" "+b);
		fib(num-2);
	}
}

	
