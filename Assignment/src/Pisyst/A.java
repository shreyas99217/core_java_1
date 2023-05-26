package Pisyst;

public class A
{
	A()
	{
		this(100);
		System.out.println("hello");
	}
	A(int a)
	{
		System.out.println("hi");
	}
	A(String a,int b)
	{
		this(10);
		System.out.println("by");
	}
	public static void main(String[] args)
	{
		new A();
	}

}
