package Number;
import java.util.Scanner;

public class SpecialTwoDigitByMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int y=sc.nextInt();
		int st = specialdigt(y);
		if(st==y) 
		{
			System.out.println(y+" is a special two digit number");
		}
		else {
			System.out.println(y+" is not special two digit number");
		}
	}
	static int specialdigt(int n) {
		int sum1=0;
		int mul=1;
		int sum=0;
		do {
			int x=n%10;
			sum1=sum1+x;
			mul=mul*x;
			n=n/10;
		}
		while(n!=0);
		return sum=mul+sum1;

	}
}


