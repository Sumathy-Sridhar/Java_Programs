package com.srm.javafullstack;
import java.util.Scanner;

public class Swapping {
	public void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping : ");
		System.out.println("Number 1: " +num1+ "\nNumber 2 : "+num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number 1: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		if((num1>0 || num1<0) && (num2<0 || num2>0)){
			Swapping sp=new Swapping();
			sp.swap(num1,num2);
		}
		else {
			System.out.println("Invalid Input");
			
		}
		
	}

}
