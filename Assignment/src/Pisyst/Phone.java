package Pisyst;

import java.util.Scanner;

public class Phone {
	String mname;
	double Price;
	Scanner Sc = new Scanner(System.in);
	Sim s;
	Phone(String m1, double d1)
	{
		mname = m1; 
		Price =d1;
	}
	public void addsim()
	{
		if(s==null)
		{
	System.out.println("enter ServiceProvider name");
	String name=Sc.next();
	System.out.println("enter mbno");
	long mbno=Sc.nextLong();
	System.out.println("enter simno");
	long Simno=Sc.nextLong();
	s=new Sim(name,mbno,Simno);
	System.out.println("Sim is inserted");
		}
	else
	{
		System.out.println("a;readu sim is inserted");
	}
	}
	public void removeSim()
	{
		if(s==null)
		{
			System.out.println("Sim is not exiting");
		}
		else
		{
			s=null;
			System.out.println("Sim is removed");
		}
	}
}
	