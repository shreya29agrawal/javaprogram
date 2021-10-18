package practiseprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAString {
	
	public void reverseString(String str){
		
		System.out.println(str);
		/*
		if(str==null)
		{
			System.out.println("not a valid string");
		}
		
		StringBuilder sr = new StringBuilder(str);
			char ch[] = str.toCharArray();
			for(int i = ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
		*/
		
		List<Character> list = new ArrayList<Character>();
	
			   for (char c: str.toCharArray()) {
		            list.add(c);
		        }
		
		Collections.reverse(list);
		
		StringBuilder builder = new StringBuilder(list.size());
		
		  for (Character c: list) {
	            builder.append(c);
	        }
	 
	        System.out.println(builder.toString());
	    }
	 
	  
	
		
		
	
	

	public static void main(String[] args) {
		ReverseAString  r = new ReverseAString ();
		r.reverseString("hello welcome to the new world ");

	}

}
