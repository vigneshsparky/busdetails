//Day 3 Question 3 
package org.company;
public class CompanyName {

	public void companyName() 
	{System.out.println("Company Information are Follow :");}
	public void companyName(byte branch) 
	{System.out.println("No of Company Branch : " +branch);}
	public void companyName(short year) 
	{System.out.println("Company Starting Year : "+year);}
	public void companyName(int reg) 
	{System.out.println("Company Register Number is : "+reg);}
	public void companyName(long nfe) 
	{System.out.println("No of Employees working at Company :"+nfe);}
	public void companyName(String nme ) 
	{System.out.println("Company Name is ;"+nme);}
	public void companyName(float salary ) 
	{System.out.println("Basic Salary is :" +salary);}
	public void companyName(double max) 
	{System.out.println("Maximum Salary is :"+ max);}
	public void companyName(int dn,String add, int pin) 
	{System.out.println("Door Number :"+dn +"\tAddress"+add +"\tPincode"+pin);}
	public void companyName(int ph, String mail) 
	{System.out.println("Contact Number is :"+ph +"Mail ID :"+mail);}
	
	public static void main(String[] args) 
	{
		CompanyName V = new CompanyName();
		V.companyName();
		V.companyName(16);
		V.companyName(2022);
		V.companyName(15242002);
		V.companyName(100000000000L);
		V.companyName("Sparky Tech Organisation");
		V.companyName(20000F);
		V.companyName(250000D);
		V.companyName(8, "Tech City, Gv Apportment", 621008);
		V.companyName(978620621, "contact@sparky.org");
	}
	
}
