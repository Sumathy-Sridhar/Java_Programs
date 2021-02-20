package com.srm.day2_prog;

import java.util.Scanner;

public class EmployeeSalary implements GrossSalary, NetSal  {
	double gross=0.0;
	public double salcalc(double basicpay) {
		double hra=0.1*basicpay;
		System.out.println("HRA : " +hra);
		double da=0.7*basicpay;
		System.out.println("DA : " +da);
		gross=basicpay+hra+da;
		System.out.println("Gross Salary : "+gross);
		return gross;
	}
	public void netcalc(double gross) {
		double incometax=0.3*gross;
		System.out.println("Income Tax: "+incometax);
		double netsal=gross-incometax;
		System.out.println("Net Salary : "+netsal);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic Pay : ");
	double basicpay=sc.nextDouble();
	EmployeeSalary emp=new EmployeeSalary();
	double g=emp.salcalc(basicpay);
	emp.netcalc(g);
	}
}
