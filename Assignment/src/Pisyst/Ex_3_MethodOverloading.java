package Pisyst;


public class Ex_3_MethodOverloading {
	
	String name;
	String city;
	float salary;
	
	public void Accept()
	{
		System.out.println("name"+"    "+"city"+" "+"salary");
	}
	public void Accept(String name)
	{
		System.out.println(name);
	}
	public void Accept(String name,String city)
	{
		System.out.println(name+" "+city);
	}
	public void Accept(String name, String city, float salary)
	{
		System.out.println(name+" "+city+" "+salary);
	}
	public static void main(String[] args) 
	{
	Ex_3_MethodOverloading obj=new Ex_3_MethodOverloading();
	obj.Accept();
	obj.Accept("Shreyas");
	obj.Accept("Shreyas","pune");
	obj.Accept("Shreyas","Pune",25000);
	
	}
}