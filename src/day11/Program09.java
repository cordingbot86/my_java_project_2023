package day11;

public class Program09 {

	public static void main(String[] args) {
		
		/*
		 0
		 2 2
		 4 4 4
		 6 6 6 6
		 8 8 8 8 8
		 */
		int n=5;
		for(int i=1,p=0;i<=n;i++,p+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
	}

}
