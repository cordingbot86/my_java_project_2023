package day06;

public class Program08 {

	public static void main(String[] args) {
		
		// && || !
		int a=80;
		int b=25;
		double c=40;
		System.out.println((a>b) && (a>c));//t
		System.out.println((b>a) && (b>c));//f
		System.out.println((c>a) && (c>b));//f
		
		System.out.println((a>b) || (a>c));//t
		System.out.println((b>a) || (b>c));//f
		System.out.println((c>a) || (c>b));//t
		
		System.out.println(!(a>b));//f
		System.out.println(!(b>c));//t
		
	}

}
