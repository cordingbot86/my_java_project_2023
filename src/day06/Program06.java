package day06;

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		//+ - * / (Q) %(R)  Number
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Value of a:-");
		int a=x.nextInt();
		System.out.println("Enter Value of a:-");
		int b=x.nextInt();
		System.out.println("Enter Double Value of a:-");
		double c=x.nextDouble();
		x.close();
		//int () int--->int
		//int () double/float---->double/float
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		System.out.println(a%b);
		System.out.println(a%c);
		
		
	}

}
