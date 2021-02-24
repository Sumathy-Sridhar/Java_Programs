package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerFilter {
	static void filterData(ArrayList arrlist,String Fname,int Age,List<CustomerDataFilter> obj)
    {
        for(CustomerDataFilter cdf:obj)
        {
        	if(cdf.getName().equals(Fname)&&cdf.getAge()==Age)
        	{
        		System.out.println("Available Records : "+"\n");
        		System.out.println("FirstName"+" "+"LastName"+" "+"Email"+" "+"Age");
        		System.out.println(cdf);
        	}
        }
    }

	public static void main(String[] args) {
		String Fname,Lname,Email;
	    int Age;
	    System.out.println("Enter the no of records : ");
	    Scanner sc=new Scanner(System.in);
	    int Num=sc.nextInt();
	    ArrayList arrlist=new ArrayList();
	    List<CustomerDataFilter> obj=new ArrayList<CustomerDataFilter>();
	    //var obj=List.of();
	    CustomerDataFilter[] cdf=new CustomerDataFilter[Num];
	    for(int i=0;i<Num;i++)
	    {
	    	System.out.println("Enter FirstName : ");
	    	Fname=sc.next();
	    	System.out.println("Enter LastName : ");
	    	Lname=sc.next();
	    	System.out.println("Enter Email : ");
	    	Email=sc.next();
	    	System.out.println("Enter Age : ");
	    	Age=sc.nextInt();
	    	cdf[i]=new CustomerDataFilter(Fname, Lname, Email, Age);
	    	arrlist.add(cdf[i]);
	    }
	    List<CustomerDataFilter> cuslist=new ArrayList<CustomerDataFilter>();
	    cuslist.addAll(arrlist);
	    System.out.println("Enter FirstName : ");
	    Fname=sc.next();
	    System.out.println("Enter Age : ");
	    Age=sc.nextInt();
	    filterData(arrlist,Fname,Age,cuslist);
		}

}
