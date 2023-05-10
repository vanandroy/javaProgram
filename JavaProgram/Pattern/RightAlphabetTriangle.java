package Pattern;

public class RightAlphabetTriangle {

	public static void main(String[] args) {
		//1.output
//		A
//		A B
//		A B C 
//		A B C D
//		A B C D E
		
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print((char)(65+j)+" ");
//			}
//			System.out.println();
//		}
		
		//2.output
//		A
//		B B
//		C C C
//		D D D D
//		E E E E E
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
		
		
	}

}
