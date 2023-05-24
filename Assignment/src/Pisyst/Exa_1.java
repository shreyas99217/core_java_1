package Pisyst;

import java.util.Scanner;

public class Exa_1 {
	Scanner Sc=new Scanner(System.in);
		String name;
		String city;
		float Salary;
	
	public void Accept()
	{
		System.out.println("Enter your name");
		name=Sc.next();
		System.out.println("Enter the city");
		 city=Sc.next();
		System.out.println("Enter your Salary");
		 Salary=Sc.nextFloat();
	}
	public void Display()
	{
		System.out.println(name);
		System.out.println(city);
		System.out.println(Salary);
	}
	public static void main(String[] args) 
	{
		Exa_1 x=new Exa_1();
		x.Accept();
		x.Display();
	}
}

	
