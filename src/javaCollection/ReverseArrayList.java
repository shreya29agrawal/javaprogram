package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("how");
		myList.add("are");
		myList.add("you");
		System.out.println("before reverse");
		//System.out.println(myList.toString());
		System.out.println("after reverse");
		Collections.reverse(myList);
		System.out.println(myList);
		myList.add("tina");
		myList.add("patel");
		System.out.println(myList);
		myList.remove(2);
		System.out.println(myList);
		
		System.out.println("***********************************");
		
		for(String value : myList)
		{
			System.out.println(value);
		}
		
		System.out.println("***********************************");
		Iterator<String> it = myList.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
