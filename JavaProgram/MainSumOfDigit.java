//6.
import java.util.Scanner;
public class MainSumOfDigit {
	static int sumOfDigit(int x) {
		int sum=0;
		do {
			int r=x%10;
			sum=sum+r;
			x=x/10;
		}
		while (x!=0);
		return sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  integer value ");
		int n=s.nextInt();
		
	  int sm=sumOfDigit(n);
	  System.out.println(sm);
		

	}

}
