package practiseprogram;

public class PyramidPatter {

	public static void main(String[] args) {
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
			
		}
		for(int k=i;k<6;k++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	for(int i=6;i>0;i--)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
			
		}
		for(int k=i;k<=6;k++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	
	
	

	}

}
