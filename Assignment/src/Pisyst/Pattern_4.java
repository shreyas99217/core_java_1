package Pisyst;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int r=5;
		int c=5;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=c; j++)
			{
				if(j<=i) 
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}



	}

}
