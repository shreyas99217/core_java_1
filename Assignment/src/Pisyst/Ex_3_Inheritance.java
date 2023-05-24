package Pisyst;

import java.util.Scanner;


	class School
	{
		Scanner Sc=new Scanner(System.in);
		String N,Tname,sub,Sname,ci,sub1,sub2;
		int Id,SId,mark,per,sal;

		public void Accept()
		{
			System.out.println("Enter the School name");
			N=Sc.next();
		}
		public void Display()
		{
			System.out.println(N);
		}
	}
	class Teacher extends School
	{
		public void Accept1()
		{
			Accept();
			System.out.println("Enter the Teacher Id");
			 Id = Sc.nextInt();
			System.out.println("Enter the Teacher Name");
			 Tname=Sc.next();
			System.out.println("Enter the Subject Name");
			 sub = Sc.next();
			System.out.println("Enter the Salary");
			 sal = Sc.nextInt();
		}
		public void Display1()
		{
			
			System.out.println(Id);
			System.out.println(Tname);
			System.out.println(sub);
			System.out.println(sal);


		}
	}
	class Student extends School
	{
		public void Accept2()
		{
			Accept();
			System.out.println("Enter the Student Id");
			 SId = Sc.nextInt();
			System.out.println("Enter the Student Name");
			 Tname=Sc.next();
			System.out.println("Enter the city");
			 ci=Sc.next();
		}
		public void Display2()
		{
			Display();
			System.out.println(Id);
			System.out.println(Tname);
			System.out.println(sub);
			System.out.println(sal);

		}

	}
	class exam extends Student
	{
		public void Accept3()
		{
			Accept();
			System.out.println("Enter the 1 Subject");
			 sub1 = Sc.next();
			System.out.println("Enter the 2 Subject");
			 sub2 = Sc.next();
			System.out.println("Enter the total mark");
			 mark = Sc.nextInt();
			System.out.println("Enter the Percentage");
			 per = Sc.nextInt();

		}
		public void Display3()
		{
			Display();
			System.out.println(sub1);
			System.out.println(sub2);
			System.out.println(mark);
			System.out.println(per);
		}
	}
	class Result extends exam
	{
		public void Percentage_Criteria()
		{
			if(per<35&& per >0)
			{
				System.out.println("Result Fail");
			}
			else
			{
				System.out.println("Result Pass");
			}
		}
	}
	public class Ex_3_Inheritance{
		public static void main(String[] args) {
		
//			Teacher obj=new Teacher();
//			
//			
//			obj.Accept1();
//			obj.Display1();
			
			Result obj3=new Result();
			obj3.Accept2();
			obj3.Display2();
			
			
			obj3.Accept3();
			obj3.Display3();
			
			
			obj3.Percentage_Criteria();
			
		}
	

}
