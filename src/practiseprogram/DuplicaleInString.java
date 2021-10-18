package practiseprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicaleInString {

	public static void main(String[] args) {
		duplicate( "java is best java lang for java practise is the worst things");
		duplicate( "100 200 3000 100 2000 300 400");
		duplicate( "java php java python java php c");

	}
	
	public static void duplicate(String inputstr)
	{
		//split method to get word by space 
		String words[]= inputstr.split(" ");
		
		// cerat one hashmap
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		//to count no of repetation
		for(String word : words)
		{
			if(wordcount.containsKey(word))
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		else
		     {
			wordcount.put(word.toLowerCase(), 1);
		     }
			
		}
		
		// extracting all the key of map = word count
		
		Set<String> wordInString = wordcount.keySet();
		 // loup through all the word in word count
		
		for(String word : wordInString)
		{
			if(wordcount.get(word)>1)
				System.out.println(word+"  : "+wordcount.get(word));
		}
		
	}
	
	

}
