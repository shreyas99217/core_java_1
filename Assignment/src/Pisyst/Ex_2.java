package Pisyst;

public class Ex_2 
{
		String name;
		String city;
		float salary;
	public void Accept(String n, String c, float s)
	{
		name =n;
		city =c;
		salary=s;
		System.out.println(n);
		System.out.println(c);
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		Ex_2 x=new Ex_2();
		x.Accept("shreyas","pune",20000);
	}
}

