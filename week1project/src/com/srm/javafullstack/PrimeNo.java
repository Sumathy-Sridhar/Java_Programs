package com.srm.javafullstack;

import java.util.Scanner;

public class PrimeNo {
	public void primemeth(int number)
	{
		boolean prime=false;
		if(number<0) {
			System.out.println("Negative Numbers not allowed");
		}
		else if(number==0 || number==1) {
			System.out.println(number + " is not a Prime Number");
		}
		else
		{
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {
					System.out.println(number + " is not a Prime Number");
					prime=true;
					break;
					
				}
			}
			if(prime==false)
			{
				System.out.println(number + "is a prime number");
			}
		}

	}
public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		PrimeNo pm=new PrimeNo();
		pm.primemeth(number);
	}
		// TODO Auto-generated method stub
		

	}
