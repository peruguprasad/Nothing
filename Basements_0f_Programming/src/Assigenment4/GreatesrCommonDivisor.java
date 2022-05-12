package Assigenment4;

public class GreatesrCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 450;
		int y = 600;
		int g=0;
		for(int i=1;i<=y;i++) {
			if(x%i==0 && y%i==0) {
//				System.out.println(i);
				g =i;
			}
//			System.out.println(g);
		}
		System.out.println(g);
	}
	}


