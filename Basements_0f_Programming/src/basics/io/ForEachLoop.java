package basics.io;

public class ForEachLoop {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,8,10};
		int total = 0;
		
		for(int element :arr ) {
			total = total + element;
			
		
		System.out.println(total);
		}

	}

}
