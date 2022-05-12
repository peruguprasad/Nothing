package assignments.io;

public class NthRootOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 25;
//		System.out.println(Math.sqrt(i));//1st way
		
		int num = 25;
		int temp;
		int sr = num/2;
		do {
			temp = sr;
			sr = (temp + (num/temp))/2;
		} 
		while((temp-sr) !=0);
		{
			System.out.println(sr);
		}
	}

}
