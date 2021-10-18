package practiseprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample  {

	public static void main(String[] args) {
		int i = 3;
	int ar[] = new int[3];

	
	 List<Integer> list = new ArrayList();
	 list.add(10);
	 list.add(20);
	 list.add(30);
	 
	System.out.println(list);
	System.out.println("*****************************");
	
	int k = list.size()-1;
	System.out.println(list.get(k));
	System.out.println("*****************************");
	
	for(int j =0 ; j<list.size(); j++)
	{
		System.out.println(list.get(j));
	}
	
	
	for(int m : list)
	{
		
	}

	}

}
