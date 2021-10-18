package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class countNumberOfWord {

	public static void main(String[] args) {
		String str = "this the is is the automation program";
		String split[] = str.split(" ");
	
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<split.length;i++)
		{
			if(map.containsKey(split[i]))
			{
				int count = map.get(split[i]);
						 map.put(split[i], count+1);
			}
			else
				 map.put(split[i], 1);
		}
		System.out.println(map);
		

	}

}
