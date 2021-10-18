package practiseprogram;

import java.util.Scanner;

public class consonantAndVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		
		char ch= sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch + "   it is vowel");
		}
		else
			System.out.println(ch+"  it is consonant");
		
		switch(ch){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			
			System.out.println(ch + "   it is vowel");
			break;
			default:
				System.out.println(ch+"  it is consonant");
				
			
		}
		
		
		sc.close();
		
		
	}
	

}
