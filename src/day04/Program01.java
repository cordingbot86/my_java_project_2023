package day04;

public class Program01 {

	public static void addMethod1(int x1, int y1)
	{
		System.out.println(x1+y1);
	}

    protected static void subMethod1(int x1, int y1)
    {
	   System.out.println(x1-y1);
    }
    protected static void mulMethod1(int x1, int y1)
    {
	   System.out.println(x1*y1);
    }
    static void sqrtMethod1(double d)
    {
	  System.out.println(d*d);
    }
   
    
    public void addMethodNonstatic(int x1, int y1)
	{
		System.out.println(x1+y1);
	}

    protected void subMethodNonstatic(int x1, int y1)
    {
	   System.out.println(x1-y1);
    }
    public  void mulMethodNonstatic(int x1, int y1)
    {
	   System.out.println(x1*y1);
    }
    void sqrtMethodNonstatic(double d)
    {
	  System.out.println(d*d);
    }
    
    
    
    
    
    public static void main(String[] args) {
      addMethod1(25,25);
      //subMethod1(40,10);
      mulMethod1(20,15);
      sqrtMethod1(10);
      Program01 x= new Program01();
      x.addMethodNonstatic(50,80);
      //x.subMethodNonstatic(20,50);
      x.mulMethodNonstatic(40,25);
      x.sqrtMethodNonstatic(30);
      
      
      
      
      
    }
	}


