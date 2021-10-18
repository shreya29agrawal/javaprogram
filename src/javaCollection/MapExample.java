package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "ram");
		map.put(2, "shyam");
		map.put(3, "gita");
		map.put(4, "babaita");
		map.put(5, "sita");
		
		System.out.println("keyset and for each loop");
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer keyentry: keySet)
		{
			Integer key = keyentry;
			System.out.println("key  "+ key+ "   value " +map.get(key));
		}
		
		System.out.println("**************iterator*******************");
		
		Iterator<Integer> keyitr = keySet.iterator();
		while(keyitr.hasNext())
		{
			Integer key = keyitr.next();
			System.out.println("key  "+ key+ "   value " +map.get(key));
			
		}
		
		System.out.println("**************EntrySet*******************");
		
		Set<Map.Entry<Integer,String>> entryset = map.entrySet();
		for(Map.Entry entry : entryset)
		{
			System.out.println("key "+entry.getKey()+ " Value "+entry.getValue());
		}
		
		System.out.println("**************EntrySet and iterator*******************");
		
		Iterator<Map.Entry<Integer, String>> itr1 = entryset.iterator();
		while(itr1.hasNext())
		{
			Map.Entry entry = itr1.next();
			System.out.println("key "+entry.getKey()+ " Value "+entry.getValue());
		}
		
		
		

	}

}
