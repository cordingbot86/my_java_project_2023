package day03;

public class Program02 {

	public static void main(String[] args) {
		Program02 xyz= new Program02();
		xyz.addMethod(25,30);
		xyz.subMethod(30, 10);
		xyz.mulMethod(15, 20);
		
		
		xyz.addMethod(20,10);
		xyz.subMethod(35, 50);
		xyz.mulMethod(15, 30);
		

	}
	
	public void addMethod(int x1, int y1)
	{
		  System.out.println(x1+y1);
	}
	public void subMethod(int x1, int y1)
	{
		  System.out.println(x1-y1);
	}
	public void mulMethod(int x1, int y1)
	{
		  System.out.println(x1*y1);
	}
	

}
