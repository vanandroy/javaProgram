package Number;

import java.util.Scanner;

public class AramstrongNumber {

	private static boolean isArmstrongNumber(int x) {
		int sum=0,temp=x;
		int dc=countDigit(x);
		do {
			int d=x%10;
			sum=sum+pow(d,dc);
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	static int pow(int d, int dc) {
		int p=1;
		while(dc>0) {
			p=p*d;
			dc--;
		}
		return p;
	}
	static int countDigit(int x) {
		int count=0;
		do {
			count++;
			x=x/10;
		}while(x!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();//153
		boolean arm=isArmstrongNumber(n);
		if(arm) {
			System.out.println(n+" is Armstrong Number");
		}
		else {
			System.out.println(n+" is not Armstrong Number");
		}

	}

}
