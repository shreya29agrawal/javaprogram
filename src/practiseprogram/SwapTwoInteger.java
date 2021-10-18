package practiseprogram;

public class SwapTwoInteger {
// swap without using tem variable;
	
	public static void main(String[] args) {
		int i =50;
		int j =34;
		
	//	i=i+j;
	//	j=i-j;
   //    i=i-j;
	//	System.out.println("i is "+i+ "  "+"j is "+j);
		
		
		i=i*j;
		j=i/j;
		i=i/j;
		
		System.out.println("i is "+i+ "  "+"j is "+j);
		
		// using Xor operator
		int p =30;
		int q = 12;
		
		p=p^q;
		q=p^q;
		p=p^q;
		
		System.out.println("p is "+p+ "  "+"q is "+q);
	}

}
