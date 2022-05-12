package Assigenment3;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 3;
int c=0;
for(int i =1;i<=number;i++) {
	if(number%i==0) {
		c++;
	}
}
//System.out.println(c);
if(c==2) {
	System.out.println("its prime");
	
}
else  {
	System.out.println("its not");
}
	}

}
