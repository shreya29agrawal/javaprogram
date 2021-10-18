package javaCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCounOfNumber {
	
	
	public static void frecuency()
	{
		int ar[] = {10,20,30,10,40,50,10,30,20};
		
		Map freqCount = new LinkedHashMap<Integer,Integer>();
		
		for(int a : ar)
		{
		if(freqCount.containsKey(a))
		{
			freqCount.put(a,(Integer)freqCount.get(a)+1);
		}
		
		else
			freqCount.put(a, 1);
		}
		
		System.out.println(freqCount);
		
		
	}
	
	

	public static void main(String[] args) {
		
		frecuency();

	}

}
