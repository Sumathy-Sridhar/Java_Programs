package com.srm.day2_prog;

import java.util.Scanner;

public class ShippingDetails implements AmtCalc{
	double price=0.0;
		public double pricecalc(double weight) {
			if(weight>=1 && weight<=5) {
				price=20.0;
			}
			else if(weight>5 && weight<=15) {
				price=40.0;
			} 
			else if(weight>15 && weight<=35) {
				price=60.0;
			}
			else if(weight>35 && weight<=50) {
				price=80.0;
			}
			else {
				price=100.0;
			}
		return price;
		}
		
	public static void main(String[] args) {
		double rate=0.0;
		Scanner sc=new Scanner(System.in);
	//	Scanner sc1=new Scanner(System.in);
		System.out.println("Customer Name: ");
		String cusname=sc.nextLine();
		System.out.println("Enter Product Name : ");
		String pname=sc.nextLine();
		System.out.println("Enter Product Description : ");
		String des=sc.nextLine();
		System.out.println("Enter Weight(in kgs) : ");
		double weight=sc.nextDouble();
		System.out.println("Enter Quantity : ");
		double quan=sc.nextDouble();
		System.out.println("Enter Continents : ");
		String cont=sc.next();
		String con=cont.toLowerCase();
		switch(con) {
		case "asia":
			rate=750;
			break;
		case "north america":
			rate=1000;
			break;
		case "south america":
			rate=1500;
			break;
		case "europe":
			rate=2000;
			break;
		default:
			rate=0.0;
			System.out.println("Service Not Available");
		}
		if(rate!=0.0) {
		ShippingDetails sd=new ShippingDetails();
		double p=sd.pricecalc(weight);
		double amount=sd.calc(p, quan, rate);
		}
	}

	@Override
	public double calc(double price, double quantity, double rate) {
		double amount=(price*quantity)+rate;
		System.out.println("Amount : "+amount);
		return amount;
	}

}
