package day08;

public class Program01 {

	public static void main(String[] args) {
      
		int a=20;
		int b=5;
		int c=5;
		int d=10;
		
		if (a>=b && a>=c && a>=d)
		{
			if (a==b && a==c && a==d)
				
			{
				System.out.println("a,b,c & d are equal");
			}
			else if (a==b && a==c && a>d)
			{
				System.out.println("a,b & c are equal and grater than d");
			}
			else if (a==b && a>c && a>d)
			{
				System.out.println("a & b are equal and greater than c & d");
			}
			else if (a==b && a>c && a==d)
			{
				System.out.println("a,b & d are equal and greater than c");
			}
			else if (a==c && a>b && a==d)
			{
				System.out.println("a,c & d are equal and grater than b");
			}
			else if (a==c && a>b && a>d)
			{
				System.out.println("a & c are equal and greater than b & d");
			}
			else if (a==d && a>b && a==c)
			{
				System.out.println("a ,d & c are equal and greater than b");
			}
			else if (a==d && a>b && a>c)
			{
				System.out.println("a & d are equal and greater than b & c");
			}
			else if (b==a&& b==c && b>d)
			{
				System.out.println("a,b & c are equal and b grater than d");
			}
			else if (b==a&& b>c && b>d)
			{
				System.out.println("a & b are equal and b greater than c & d");
			}
			else if (b==a && b>c && b==d)
			{
				System.out.println("a,b & d are equal and b greater than c");
			}
			else if (b==c && b>a && b==d)
			{
				System.out.println("a,c & d are equal and b grater than d");
			}
			else if (b==c && b>a && b>d)
			{
				System.out.println("b & c are equal and b greater than a & d");
			}
			else if (b==d && b>a && b==c)
			{
				System.out.println("b ,d & c are equal and b greater than a");
			}
			else if (b==d && b>a && b>c)
			{
				System.out.println("b & d are equal and b greater than a & c");
			}
			else if (c==a && c==b && c>d)
			{
				System.out.println("a,b & c are equal and c grater than d");
			}
			else if (c==a && c>b && c>d)
			{
				System.out.println("a & c are equal and c greater than b & d");
			}
			else if (c==a && c>b && c==d)
			{
				System.out.println("a,c & d are equal and c greater than b");
			}
			else if (c==a && c>b && c==d)
			{
				System.out.println("a,c & d are equal and c grater than b");
			}
			else if (d==c && d>a && d>b)
			{
				System.out.println("d & c are equal and d greater than b & a");
			}
			else if (d==a && d>b && d==c)
			{
				System.out.println("a ,d & c are equal and d greater than b");
			}
			else if (d==a && d>b && d>c)
			{
				System.out.println("a & d are equal and d greater than b & c");
			}
			
			else if (a>b && a>c && a>d)
			{
				System.out.println("a is greater than b , c & d");
			}
			else if (b>a && b>c && b>d)
			{
				System.out.println("b is grater than a,c & d");
			}
			else if (c>a && c>b && c>d)
			{
				System.out.println("c is grater than a,b,& d");
			}
			else if (d>a && d>b && d>c)
			{
				System.out.println("d is greater than a,b,& c ");
			}
			else if (a>c && c>d)
			{
				System.out.println("a is grater than c and c is greater than d");
			}
			else if (b>c && b>d)
			{
				System.out.println("a is greater than b and b is greater than c & d");
			}
			else if (c>b & c>d)
			{
				System.out.println("a is greater than c and c greater than b & d");
			}
			else if (d>c)
			{
				System.out.println("a is greater than d and d greater than c ");
			}
			else if (c>b)
			{
				System.out.println("a is grater than c and c greater than b ");
			}
			else if (b>c)
			{
				System.out.println("a is greater than b and b  greater than c ");
			}
			else if (c>d)
			{
				System.out.println("a is greater than c and c greater than d");
			}
			else if (c==d)
			{
				System.out.println("a is greater than b,c & d and c & d are equal");
			}
			else if (a>c)
			{
				System.out.println("b is greater than a,c & d and a greater than c ");
			}
			else if (a>d)
			{
				System.out.println("c is grater than a,b & d and a greater than d");
			}
			else if (b>a)
			{
				System.out.println("d is grater than a,b,& c and b greater than a");
			}
			else if (a>b)
			{
				System.out.println("c is grater than a,b & d and a greater than b");
			}
		
			else if (b==c)
			{
				System.out.println("a greater than b,c & d and b & c equal");
			}
			
		}

	}

}
