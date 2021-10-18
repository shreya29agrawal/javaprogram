package practiseprogram;

public class dimondPatter {

	public static void main(String[] args) {
		int j;
		for(int i = 1;i<6;i++)
		{
			for( j =5 ; j>i ;j--)
			{
				System.out.print(" ");
			}
			for( j =1 ; j<=i ;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		for(int i = 6;i>1;i--)
		{
			for( j =5 ; j>=i ;j--)
			{
				System.out.print(" ");
			}
			for( j =1 ; j<i ;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}
}
	


