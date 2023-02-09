package day04;

public class Program02 extends Program01 {

	public static void main(String[] args) {
		//addMethod(25,25);//It's Private Method-not
		//subMethos(40,10);//It's Private Method-not
		//mulMethod(20,15);//It's Private Method-not
		//sqrtMethod(10);//It's Private Method-not
		Program01 x= new Program01();// current class
		 x.addMethodNonstatic(50,80);
	      //x.subMethodNonstatic(20,50);
	      x.mulMethodNonstatic(40,25);
	      x.sqrtMethodNonstatic(30);
	      
		
	}

}
