package Assigenment4;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sy = 1900;
int ey = 2020;
for(int i = sy;i<=ey;i++) {
	if((i%400==0) || (i%4==0 && i%100!=0)) {
		System.out.println("its a leap"+" "+i);
	}
	else {
		System.out.println("its not");
		
	}
}
	}

}
