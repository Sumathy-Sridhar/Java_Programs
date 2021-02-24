package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class customerdatasort{
	private String customername;
    private int cusid;
    
    public  customerdatasort(int cusid, String customername) {
        this. cusid =  cusid;
        this.customername = customername;
       }
    public String toString() {
    	return cusid+ " " +customername;
    }
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
}
public class Cutomercollect {
	static void sortData(ArrayList al)
	{
		Collections.sort(al,new Sortclass());
		System.out.println(al);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String customername;
		int cusid;
		System.out.println("enter size of array: ");
		int n=sc.nextInt();
		ArrayList arraylist = new ArrayList();
		System.out.println("Enter values: ");
		for (int i=0;i<n;i++) {
			cusid=sc.nextInt();
			customername=sc.next();
			arraylist.add(new customerdatasort(cusid,customername));
		}
		System.out.println(arraylist.toString());
		sortData(arraylist);
		
	}

}
