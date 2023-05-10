package Pattern;

public class FloydsTrianglePattern {

	public static void main(String[] args) {
		//output
//		1
//		2 3
//		4 5 6 
//		7 8 9 10
		int number=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j>=i;j++) {
				System.out.print(number +" ");
				number++;
			}
			System.out.println();
		}
	}

}
