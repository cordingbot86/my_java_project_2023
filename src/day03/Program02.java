package day03;

public class Program02 {

	public static void main(String[] args) {
		Program02 xyz= new Program02();
         xyz.addMethod(20,30);
         xyz.subMethod(10,5);
         xyz.mulMethod(10,10);
         
         xyz.addMethod(40,20);
         xyz.subMethod(10, 20);
         xyz.mulMethod(30, 15);

	}

	public void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}	
	 
	public void subMethod(int a,int b)
	{
		System.out.println(a-b);
		
	}
	public void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}	
		
		
		

	}


