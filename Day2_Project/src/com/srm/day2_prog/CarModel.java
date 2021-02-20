package com.srm.day2_prog;

import java.util.Scanner;

public class CarModel {
	public void EngineOnOff(int speed) {
		if(speed>0) {
			System.out.println("Engine On!!");
			if(speed>=10 && speed<=20) {
			System.out.println("Please Accelerate Fast!");
			speed=speed+20;
			System.out.println("Current Speed: "+speed);
		}
		else if(speed>20 && speed<=30) {
			System.out.println("Please Accelerate Fast!");
			speed=speed+10;
			System.out.println("Current Speed: "+speed);
		}
		else if(speed>=60 && speed>=80) {
			System.out.println("Please Accelerate Slow!");
			speed=speed-20;
			System.out.println("Current Speed: "+speed);
		}
		else
		{
			System.out.println("Maintain the Acceleration!");
			System.out.println("Current Speed: "+speed);
		}
	}
		else {
			System.out.println("Engine Off!!");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car Model: ");
		String model=sc.nextLine();
		System.out.println("Enter year of Release: ");
		String year=sc.next();
		System.out.println("Manufacturer : ");
		String manufac=sc.next();
		System.out.println("Enter Speed : ");
		int speed=sc.nextInt();
		CarModel cm=new CarModel();
		cm.EngineOnOff(speed);
		
		
		
	}

}
