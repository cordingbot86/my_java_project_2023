package day05.test01;

public class Program05 extends Program04{
	
	public static void main(String[] args) {
		display();
		display();
		Program05 x= new Program05();
		x.displayNonStatic();//Program03-class
		x.displayNonStatic();//Program04-class
	}

}
