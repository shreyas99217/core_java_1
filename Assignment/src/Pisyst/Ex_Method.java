package Pisyst;

import java.util.Scanner;

public class Ex_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		m1(a);
		m2(a);
	}
	public static int m1(int a)
	{
		while(a>0)
		{
			System.out.print(a%10);
			a=a/10;
		}
		return 0;

	}

	public static String m2(int a)
	{
		if(a%2==0)
		{
			System.out.println();
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		return "Shreyas";
		
		}

	}

