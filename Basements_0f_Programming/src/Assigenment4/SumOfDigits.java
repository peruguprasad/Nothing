package Assigenment4;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  number = 359;
int rem;
int sum=0;
while(number>0) {
	rem = (number%10);
	sum = sum + rem;
	number = number/10;
	
}
System.out.println(sum);
	}

}
