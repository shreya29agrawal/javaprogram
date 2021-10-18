package practiseprogram;

public class ArrayIndextarget {
	
	public void arrayTarget(){
		
		int arr[] = { 20,40,35,56,84};
		int target = 75;
		int sum;
		for(int i=0;i<4;i++){
			 sum = (arr[i] + arr[i+1]);
			if(sum == target )
			{System.out.println (i+ "  " + (i+1)) ;
			System.out.println(arr[i]+ " "+arr[i+1]);
			}
			
			
		}
		
	}
	

	public static void main(String[] args) {
	
		ArrayIndextarget at = new ArrayIndextarget();
		at.arrayTarget();
	}

}
