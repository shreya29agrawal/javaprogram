package practiseprogram;

import java.util.HashSet;
import java.util.Set;

public class FrequencyCount {
	
	public static final int size = 26;

	public static void main(String[] args) {
		
		String str ="hello this is the world of hell";
		String str1 = str.replaceAll(" ", "");
		
		char s[]= new char[str1.length()];
		
		for(int i=0;i<str1.length();i++){
			
			s[i]= str1.charAt(i);
			System.out.print(s[i]);

			
		}
		System.out.println();
		System.out.println("**************************");
		
		int n = s.length;
		int[] freq = new int[size];
		
		 for (int i = 0; i <=n; i++)
	            freq[str.charAt(i) - 'a']++;
	 
	        // traverse 'str' from left to right
	        for (int i = 0; i < n; i++) {
	 
	            // if frequency of character str.charAt(i)
	            // is not equal to 0
	            if (freq[str.charAt(i) - 'a'] != 0) {
	 
	                // print the character along with its
	                // frequency
	                System.out.print(str.charAt(i));
	                System.out.print(freq[str.charAt(i) - 'a'] + " ");
	 
	                // update frequency of str.charAt(i) to
	                // 0 so that the same character is not
	                // printed again
	                freq[str.charAt(i) - 'a'] = 0;
	            }
	        }
		
		
		
	/*	Set<String> str3 = new HashSet<>();
		str3.add(str);

		int count =0;
		String s4;
		
		for(String s2: str3)
		{   
			s4 = s2.replaceAll(" ", "");
			
			System.out.print(s4);
			
		}
		
	*/

		
		
		
		
		
		

	}

}
