package practiseprogram;

public class InterchangeString {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2=  "world";
		
		System.out.println("befor swapping");
		System.out.println(s1+" " +s2);	
		
		System.out.println("after swaping");
		// append s1 and s2
		 s1 = s1+s2;
		 // store string a in string b
		 s2=s1.substring(0,s1.length()-s2.length());
		 System.out.println("now string second is "+s2);
		 
		 s1=s1.substring(s2.length());
		 System.out.println("now string first is "+s1);
		 
		 System.out.println(s1+"   "+s2);
		 
		
		

	}

}
