package day03.test01;

public class Program02 extends program01{
	//Program01-super class(parent)
	//Program02-sub class(child)
	
	public static void main(String[] args) {
		Program02 xyz= (Program02) new program01();
		xyz.addMethod(10,15);
		subMethod(40,20);
		mulMethod(20,30);
		
		

	}

}
