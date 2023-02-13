package day07;

public class Program06 {

	public static void main(String[] args) {
	    int x=20;
	    int y=10;
	    int z=5;
	    
	    System.out.println("Start Program...!");
	    if(x>y)
	    {
	    	System.out.println("x is greater...!");
	    }
        if(y>z)
        {
        	System.out.println("y  is greater...!");
        }
        if(x>z)
        {
        	System.out.println("x is greater..!");
        }
        else if(x<y)
        {
        	System.out.println("y is greater..!");
        }
        else if(y<z)
        {
        	System.out.println("z is greater..!");
        }
        else if(x==y)
        {
        	System.out.println("x & y are equal...!");
        }
        else if(y==z)
        {
        	System.out.println("y & z are equal...!");
        }
        
        System.out.println("End Program..!");
	}

}
