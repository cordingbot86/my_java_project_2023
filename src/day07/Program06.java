package day07;

public class Program06 {

	public static void main(String[] args) {
	    int x=15;
	    int y=10;
	    int z=10;
	    
	    System.out.println("Start Program...!");
	    
	    if (x>=y && y>=z)
	    {
	    	if (x==y && x==z)
	    	{
	    		System.out.println("x,y & z are equal");
	    	}
	    	else if (x==y && x>z)
	    	{
	    		System.out.println("x & y are equal and greater than z ");
	    	}
	    	else if (x==z && x>y)
	    	{
	    		System.out.println("x & z are equal and greater than y");
	    	}
	    	else if (y>z)
	    	{
	    		System.out.println("x is greater than y and y is greater than z");
	    	}
	    	else if (z>y) 
	    	{
	    		System.out.println("x is greater than z and z is greater than y");
	    		
	    	}
	    	else if (y==z)
	    	{
	    		System.out.println("x is greater than y&z and y & z are equal");
	    	}
        }
        
        System.out.println("End Program..!");
	}

}
