package practiseprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of elemet you want to enter");
		
		int k =sc.nextInt();
		
		String s[] = new String[k];
		
		System.out.println("enter sting value");
		for(int i=0;i<k;i++)
		{
			s[i] = sc.next();
		}
	
			for(int i=0;i<k;i++)
			{
				for(int j =i+1;j<s.length;j++)
				{
					if(s[i].equals(s[j]))
				 {   System.out.println("found duplicate elemant ");
					 System.out.println(s[i]);
				 }
					
			    }
				
			}
		// using hashset its a propertuy of hashset
			
			Set<String> s1=new HashSet<String>();
			// set object cannot add duplicate value
			
				for(String str :s)
				{
					if(s1.add(str)==false)
					{
						System.out.println("duplicate element is:::"+ str);
					}
				}
		// using hashmap:
				
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String str1:s)
		{
	
		}
					
					
		sc.close();			
					
	
			
				
		
	}

}
