package com.srm.javafullstack5;

import java.io.File;

public class FileHashValue {
	public static void main(String[] args) {
		File  fileobj  = null;
	      int path;
	      boolean bool = false;
	      System.out.println("Generating Hash Value of the File");
	      try
	      	{
	    	 fileobj = new File("C:\\Sumathy\\Dem.txt");
	         path =  fileobj .hashCode();
	         bool =  fileobj .exists();
	         if(bool)
	         	{
	        	 	System.out.println("The hash code for this abstract pathname: " +path);
	         	}
	         
	         
	      } 
	      catch(Exception e) {
	         System.out.println("File doesnot Exist!");
	     
	      }

	}

}
