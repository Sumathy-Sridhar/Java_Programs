package com.src.javafullstack4;

public class GenericMutipleBound {

	public static void main(String[] args) {
		System.out.printf("Max of %d, %d and %d is %d\n\n", 
		         20, 40, 15, maximum( 20, 40, 15 ));

		      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
		         66.6, 98.9, 23.17, maximum( 66.6, 98.9, 23.17 ));
		   }

		   public static <T extends Number 
		      & Comparable<T>> T maximum(T x, T y, T z) {
		      T max = x;      
		      if(y.compareTo(max) > 0) {
		         max = y;   
		      }

		      if(z.compareTo(max) > 0) {
		         max = z;                    
		      }
		      return max;      
		   }
	}

