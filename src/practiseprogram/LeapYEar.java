package practiseprogram;

import java.util.Scanner;

public class LeapYEar {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter year");
	
	int y = sc.nextInt();
	
  if((y%4==0) && (y%100==0))
  {
	 if(y%400==0) 
		 System.out.println("it is leap year");
	 else
		 System.out.println("not a leap year");
	 
  }
  else
		 System.out.println("not a leap year");

	}

}
