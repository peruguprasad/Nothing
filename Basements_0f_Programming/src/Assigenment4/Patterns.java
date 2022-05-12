package Assigenment4;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
int n =5;
for(i=1;i<=n;i++) {
	for(j=1;j<=i;j++)//Increasing Triangle
	{
		System.out.print("*");
		
	}
	System.out.println();
}
for(i=1;i<=n;i++) {
	for(j=i;j<=n;j++) {//Decreasing Triangle
		System.out.print("*");
	}
	System.out.println();
}
	}

}
