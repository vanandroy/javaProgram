package Number;

import java.util.Scanner;

public class HappyNumber {
	public static boolean isHappyNumber(int x) {
		while(x>9) {
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return (x==1||x==7);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();//28
		boolean hp=isHappyNumber(n);
		if(hp) {
			System.out.println(n+" is Happy Number");
		}
		else {
			System.out.println(n+" is Not Happy Number");
		}
	}

}
