package day07;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int x1=x.nextInt();
		x.close();
		System.out.println("Start Program...!");
		if(x1%2==0)
		{
			System.out.println("x is greater...!");
		}
		else
		{
			System.out.println("x is greater..!");
			
		}
		
		System.out.println("End Program..!");
	}
}
