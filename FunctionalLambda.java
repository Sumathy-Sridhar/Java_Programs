package com.srm.javafullstack9;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionalLambda {

	public static void main(String[] args) {
		ArrayList<Integer> lambarray = new ArrayList<Integer>();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter size of Array : ");
	      int num=sc.nextInt();
	      System.out.println("Enter the Elements of the Array : ");
	      for(int i=0;i<num;i++) {
	    	  lambarray.add(sc.nextInt());
	      }
	      System.out.println("Elements of the ArrayList : ");
	      lambarray.forEach(n -> System.out.println(n)); 
	      System.out.println("Result : ");
	      System.out.println(
	    		  lambarray.stream()
	                  .filter(number -> number % 2 == 0)
	                  .mapToInt(e -> e * 2)
	                  .sum());
	               

	}

}
 