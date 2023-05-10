package Pattern;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		//output
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
