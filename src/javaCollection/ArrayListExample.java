package javaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ArrayListExample {
	
	public static void main(String args[]){ 
		
 List<String> name = new ArrayList<String>();
  name.add("ram");
  name.add("rama");
  name.add("shyam");
  name.add("tina");
  name.add("tanya");
  
  Iterator it = name.iterator();
  while(it.hasNext())
  {
	  System.out.println(it.next());
  }

 name.remove(2);
 name.add(2, "jaya");
 System.out.println("***********************************");
System.out.println( name.contains(name));
System.out.println("***********************************");
Iterator it2 = name.iterator();
while(it2.hasNext())
{
	  System.out.println(it2.next());
}
System.out.println("***********************************");


 System.out.println(name.toString());
Collections.reverse(name);
System.out.println(name);

 
	}

}
