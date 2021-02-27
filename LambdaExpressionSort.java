package com.srm.javafullstack8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LambdaExpressionSort {
	public void oddArrayList(ArrayList<Integer> lambarray)
	{
		int counter=0;
		for(int i=0;i<lambarray.size();i++)
		{
			int num=lambarray.get(i);
			if(num%2!=0)
				{
					counter++;
				}
		}	
	if(counter>=1){
		System.out.println("\nArrayList contains " + counter +" ODD numbers...");
		}
	else {
		System.out.println("\nArrayList contains no ODD numbers...");
	}
}
	public static void main(String[] args) {
		
		ArrayList<Integer> lambarray = new ArrayList<Integer>();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter size of Array : ");
	      int num=sc.nextInt();
	      for(int i=0;i<num;i++) {
	    	  lambarray.add(sc.nextInt());
	      }
	      System.out.println("Elements of the ArrayList : ");
	      lambarray.forEach(n -> System.out.println(n)); 
	      new LambdaExpressionSort().oddArrayList(lambarray);
	      
	      
	}

}
