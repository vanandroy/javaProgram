package Number;

import java.util.Scanner;

public class DisarumNumber {
	static boolean isDisarumNumber(int x) {
		int dc=countDigit(x);
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+pow(d,dc);
			dc--;
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	static int countDigit(int y) {
		int count=0;
		do {
			y=y/10;
			count++;
		}while(y!=0);
		return count;
	}
	static int pow(int d,int dc) {
		int prod=1;
		while(dc>0) {
			prod=prod*d;
			dc--;
		}
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();//89,135,175,518
		boolean dis=isDisarumNumber(n);
		if(dis) {
			System.out.println(n+" is Disarum Number");
		}
		else {
			System.out.println(n+" is not Disarum Number");
		}

	}

}
