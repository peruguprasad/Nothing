package Assigenment5;

public class TransposeOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{10,20,30},{12,34,50}};
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i =0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		
		}

	}


