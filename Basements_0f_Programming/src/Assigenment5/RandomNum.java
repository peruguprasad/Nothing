package Assigenment5;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Random random = new Random();
//int arr[i] = random.nextInt();
//System.out.println(x);

int[] arr = new int[8];

for(int i =0;i<=arr.length-1;i++) {
	Random random = new Random();
	int randomnum = random.nextInt(10);
	
	System.out.println(randomnum);
}

	}

}
