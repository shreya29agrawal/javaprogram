package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {
	
	public static void main(String args[]){ 
		
	
	String name[] = new String[5];
	name[0]="ram";
	name[1]="shyam";
	name[2]="sita";
	name[3]="babita";
	name[4]="geeta";
	
List<String> nameList = new ArrayList<String>();
nameList = Arrays.asList(name);
System.out.println(nameList);
System.out.println("**************************");
System.out.println("now array to array list");

System.out.println(nameList.toArray(new String[nameList.size()]));
	
	
	
	
	
	
}


}
