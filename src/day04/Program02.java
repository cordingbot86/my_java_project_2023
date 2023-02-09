package day04;

public class Program02 extends Program01 {

	public static void main(String[] args) {
		//addMethod(25,25);//It's Private Method-not visible
		//subMethos(40,10);//It's Private Method-not visible
		//mulMethod(20,15);//It's Private Method-not visible
		//sqrtMethod(10);//It's Private Method-not visible
		Program01 x= new Program01();// current class object
		 x.addMethodNonstatic(50,80);
	      //x.subMethodNonstatic(20,50);
	      x.mulMethodNonstatic(40,25);
	      x.sqrtMethodNonstatic(30);
	            
}
}
