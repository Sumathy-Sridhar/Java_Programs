package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOddList {
	public void oddArrayList(ArrayList<Integer> oddlist)
	{
		int counter=0;
		for(int i=0;i<oddlist.size();i++)
		{
			int num=oddlist.get(i);
			if(num%2!=0)
				{
					counter++;
				}
		}	
	if(counter>=1){
		System.out.println("\nArrayList contains " + counter +" ODD numbers...");
		}
	else {
		System.out.println("\nArrayList does not contain ODD numbers...");}
	}

	public static void main(String[] args) {
		ArrayList<Integer> oddlist=new ArrayList<>();
		System.out.println("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Enter the Values : ");
		for (int i=0;i<n;i++) {
			oddlist.add(sc.nextInt());
		}
		System.out.println(oddlist);
		new CheckOddList().oddArrayList(oddlist);
		
		}

}
