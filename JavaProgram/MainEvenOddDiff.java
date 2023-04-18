import java.util.Scanner;
public class MainEvenOddDiff {
static int evenOddDigitDifference(int x) {
	int sum1=0;
	int sum2=0;
	do {
		int r=x%10;
		if(r%2==0) 
		sum1=sum1+r;	
		if(r%2!=0)
			sum2=sum2+r;
		x=x/10;
	}
		while(x!=0);
			return sum1+sum2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		int eo=evenOddDigitDifference(n);
		System.out.println("Difference of sum of( even no. and odd no.): "+eo);

	}

}
