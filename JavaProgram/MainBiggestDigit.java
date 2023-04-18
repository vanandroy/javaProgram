import java.util.Scanner;

public class MainBiggestDigit {
	static int biggestDigit(int x) {
		int big =-9;
		do {
			int r=x%10;
			if(r>big)
			big=r;
		  x=x/10;
			}
		while(x!=0);
			return big;		
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the integer value");
			int n=sc.nextInt();
			int bd=biggestDigit(n);
			System.out.println("Biggest Digit Of "+n+" is "+bd);
			


			
	}

}
