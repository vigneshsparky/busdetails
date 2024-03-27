//Q 10
//single inheritance 
package org.company;
import org.client.Client;
public class Company extends Client
{
	private void companyName() 
	{System.out.println("Company Name");}
	public static void main(String[] args) 
	{
		Company c = new Company();
		c.companyName();
		c.clientName();
	}
}
