package Pattern;

public class DownwordTriangle {

	public static void main(String[] args) {
		//output
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
