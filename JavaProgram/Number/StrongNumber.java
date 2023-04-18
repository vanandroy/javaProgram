package Number;

import java.util.Scanner;

public class StrongNumber {
	public static boolean isStrongNumber(int x) {
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}

	public static int fact(int d) {
		int fact=1;
		while(d>0) {
			fact=fact*d;
			d--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();
		boolean st=isStrongNumber(n);
		if(st) {
			System.out.println(n+" is strong number");
		}
		else {
			System.out.println(n+" is not strong number");
		}
		

	}

}
