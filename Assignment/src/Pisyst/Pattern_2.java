package Pisyst;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		int num=1;
		for(int i=1; i<=r; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
