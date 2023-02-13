package day06;

public class Program07 {

	public static void main(String[] args) {
		// < > <= >= == != --->true/false
		int a=30;
		int b=25;
		double c=25;
		System.out.println("%%%%%%%%%%%");
		System.out.println(a>b);//t
		System.out.println(b>a);//f
		System.out.println(a<b);//f
		System.out.println(b<a);//t
		
		System.out.println("%%%%%%%%%%%");
		System.out.println(a>=b);//t
		System.out.println(b>=a);//f
		System.out.println(a<=b);//f
		System.out.println(b<=c);//t
		
		System.out.println("%%%%%%%%%%%");
		System.out.println(a==b);//f
		System.out.println(b!=a);//t
		System.out.println(a<b);//f
		System.out.println(b!=c);//f
		
		
		
		

	}

}
