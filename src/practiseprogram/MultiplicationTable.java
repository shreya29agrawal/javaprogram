package practiseprogram;

import java.util.Scanner;

public class MultiplicationTable {

	// multiplication table
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no for table");
		
		int n= sc.nextInt();
		int mul =0;
		for(int i =1; i<=10; i++)
		{
			mul =(n*i);
			System.out.println(n+" * "+i+" = "+ mul);
		}
	}

}
