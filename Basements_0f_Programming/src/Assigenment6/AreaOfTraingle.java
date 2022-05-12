package Assigenment6;

import java.util.Scanner;

public class AreaOfTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 0;
		int height = 0;
		int area =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter base of a triangle");
		base = scanner.nextInt();
		System.out.println("enter height of a traingle");
		height = scanner.nextInt();
		
		area = (base * height) /2;
		System.out.println("area of the traingle"+" "+area);
		
		
					

	}

}
