package day12;

public class Program04 {

	public static void main(String[] args) {
		
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 11 12 13 14 15
		 */
		int temp=1;
				
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+"");
				temp=temp+1;
			}
			System.out.println();
		}

	}

}
