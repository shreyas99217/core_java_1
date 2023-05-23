package Pisyst;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		age =sc.nextInt();

		if(age>56) {
			System.out.println("You are experienced");
		}
		else if(age>46) {
			System.out.println("you are semi-experienced");
		}
		else {
			System.out.println("you are not experienced");
		}
	}

}

