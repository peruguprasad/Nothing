package Assigenment5;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {16,67,100,76,7,9,77};
		int large = arr[0];
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]>arr[0]) {
				large = arr [i];
			}
		}
		System.out.println(large);

	}

}
