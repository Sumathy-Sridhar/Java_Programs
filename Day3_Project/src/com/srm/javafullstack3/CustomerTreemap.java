package com.srm.javafullstack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class customertreedata{
	private String customername;
    private int cusid;
    
    public  customertreedata(int cusid, String customername) {
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
public class CustomerTreemap {
	
	
	public static void main(String[] args) {
		TreeMap<Integer,String> custreemap = new TreeMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		String customername;
		int cusid,n;
		System.out.println("enter size of array: ");
		n=sc.nextInt();
		System.out.println("Enter values: ");
		for (int i=0;i<n;i++) {
			cusid=sc.nextInt();
			customername=sc.next();
			custreemap.put(cusid, customername);
		}
		Set set = custreemap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	     }
	 
	      HashMap hmap=new HashMap();
		  hmap.putAll(custreemap);
		  System.out.println("Treemap After sorting: "+hmap);
	      
	     
	}
}
