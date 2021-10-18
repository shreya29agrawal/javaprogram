package practiseprogram;

import java.util.Scanner;

// find maximum and minimum in array

public class LArgeAndSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inter the number of integer want to put");
		int k=sc.nextInt();
		System.out.println("enter the integer");
		int ar[]=new int[k];
		for(int i=0;i<k;i++)
		{
			ar[i]=sc.nextInt();
			System.out.print(" "+ar[i]+ " ");
		}
		System.out.println("");
		System.out.println("*******************");
       int max=ar[0];
       int small=ar[0];
       for(int i=1;i<k;i++)
		{
			if(ar[i]>max)
			{
			 max=ar[i];
			}
			else if(ar[i]<small)
			{
				small=ar[i];
			}
			
		}
		System.out.println("largest no is "+max);
		System.out.println("smallest no is  "+small);
		sc.close();
	}

}
