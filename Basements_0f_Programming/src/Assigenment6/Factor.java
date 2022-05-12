package Assigenment6;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int fac =1;
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the num");
		int f = scanner.nextInt();
		for(int i =1;i<=f;i++) {
			fac = fac*i;
			
		}
		System.out.println(fac);

	}

}
