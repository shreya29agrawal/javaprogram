package practiseprogram;

import java.util.Scanner;

public class StringManuplulation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of elemet you want to enter");
		
		int k =sc.nextInt();
		
		String s=null;
		
		System.out.println("enter sting value");
		for(int i=0;i<k;i++)
		{
			s = sc.next();
		}
       System.out.println(s);
	}

}
