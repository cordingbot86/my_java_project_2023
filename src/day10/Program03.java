package day10;

public class Program03 {

	public static void main(String[] args) {
		
		int table=8;
		System.out.println("............While Program..........");
		int a=1;
		while(a<=12)
		{
			System.out.println(table+"x"+a+"="+table*a);
			a=a+1;
		}
		System.out.println(".........Do While Program........");
		int b=1;
		do 
		{
			System.out.println(table+"x"+b+"="+table*b);
		b=b+1;
		
		}while(b<=12);
	

	}

}
