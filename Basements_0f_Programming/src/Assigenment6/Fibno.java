package Assigenment6;

import java.util.Scanner;

public class Fibno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
System.out.println("enter first num");
int n1 = scanner.nextInt();
System.out.println("second num");
int n2 = scanner.nextInt();
System.out.println("condition");
int n = scanner.nextInt();
int n3 =0;
for(int i =1;i<=n;i++) {
 	n3 = n1 + n2;
n1 = n2;
n2 = n3;
System.out.println(n3);
}

	}

}
