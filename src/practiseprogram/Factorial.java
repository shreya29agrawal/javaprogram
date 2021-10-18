package practiseprogram;

import java.util.Scanner;

public class Factorial {
// factorialof no
	
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no for factorial");
			int fact = 1;
			int y = sc.nextInt();
			for(int i=1;i<=y;i++)
			{
				fact= fact*i;
			}
			System.out.println(fact);
	}

}
