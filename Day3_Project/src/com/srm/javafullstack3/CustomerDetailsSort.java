package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CustomerDetails{
	String FirstName,LastName,Email;
	int Age;
	CustomerDetails(String FirstName,String LastName,String Email,int Age)
	{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
	this.Age=Age;
	}
	public String toString()
	{
	return FirstName+" "+LastName+" "+Email+" "+Age;
	}
	public int getAge() {
	return Age;
	}
	public void setAge(int age) {
	Age = age;
	}
	public void setName(String FirstName)
	{
	this.FirstName=FirstName;
	}
	public String getName()
	{
	return FirstName;
	}

}

public class CustomerDetailsSort {
	static void sortData(ArrayList al)
	{
	Collections.sort(al,new SortByName().thenComparing(new SortByAge()).reversed());
	System.out.println(al);
	}
	public static void main(String[] args) {
		String FirstName,LastName,Email;
		int Age;
		ArrayList<CustomerDetails> customerlist=new ArrayList<CustomerDetails>();
		System.out.println("Enter no. of customer object : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{

		System.out.println("Enter FirstName : ");
		FirstName=sc.next();
		System.out.println("Enter LastName : ");
		LastName=sc.next();
		System.out.println("Enter Email Id : ");
		Email=sc.next();
		System.out.println("Enter Age : ");
		Age=sc.nextInt();
		customerlist.add(new CustomerDetails(FirstName, LastName, Email, Age));
		}

		sortData(customerlist);

	}

}
