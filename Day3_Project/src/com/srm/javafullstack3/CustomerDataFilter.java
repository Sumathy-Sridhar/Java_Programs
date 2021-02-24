package com.srm.javafullstack3;

public class CustomerDataFilter {
	String FirstName,LastName,Email;
	int Age;
	CustomerDataFilter(String FirstName,String LastName,String Email,int Age)
	{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
	this.Age=Age;
	}
	public String toString()
	{
	return FirstName+" "+LastName+" "+Email+" "+Age;
	}
	public int getAge() {
	return Age;
	}
	public void setAge(int age) {
	Age = age;
	}
	public void setName(String FirstName)
	{
	this.FirstName=FirstName;
	}
	public String getName()
	{
	return FirstName;
	}

}
