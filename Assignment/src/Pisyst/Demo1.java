package Pisyst;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args)
	{
		System.out.println("Taking  Input From the User");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1");	
		int a=sc.nextInt();
		System.out.println("Emter number 2");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("The sum of these number is");
		System.out.println(sum);
	}

}
