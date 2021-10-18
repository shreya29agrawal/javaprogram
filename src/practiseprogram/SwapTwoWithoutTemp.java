package practiseprogram;

public class SwapTwoWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 40;
		
		System.out.println("a= " +((a+b)-a));
		System.out.println("b= " +((a+b)-b));
		
		
		String str = " hello wellcome";
		StringBuilder sr = new StringBuilder(str);
		char ch[] = str.toCharArray();
		for(int i =0 ;i<=ch.length-1;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')	
			{
				System.out.println("  Contains vowel     " +ch[i]);
			}
		}
		

	}

}
