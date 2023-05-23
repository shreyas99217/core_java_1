package Pisyst;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows");
	int r=sc.nextInt();
	System.out.println("Enter the column");
	int c=sc.nextInt();
	for (int i=1; i<=r; i++)
	{
		for (int j=1; j<=c; j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}
}