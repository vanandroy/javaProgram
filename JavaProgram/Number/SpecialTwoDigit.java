package Number;
import java.util.Scanner;

public class SpecialTwoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two digit number");
		int n=sc.nextInt();
		int d1=n/10;
		int d2=n%10;
		int sum=d1+d2+d1*d2;
		if(sum==n)
		{
			System.out.println("No. is special two digit no.");
		}
		else 
		{
			System.out.println("No. is not special two digit no.");
		}
	}

}
