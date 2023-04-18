package Number;

import java.util.Scanner;

public class DemoNumber {
	static boolean isXylemPholemNumber(int x) {
		int es=0,ms=0,temp=x;
		do {
		int d=x%10;
			if(x<10||temp==x) {
				es=es+d;
			}else {
				ms=ms+d;
			}
			x=x/10;
		}while(x!=0);
		return es==ms;
	}
	
	public static void main(String[] args) {
		int n=1234;
		boolean st=isXylemPholemNumber(n);
		if(st) {
			System.out.println(n+" is Xylem number");
		}
		else {
			System.out.println(n+" is not Pholem number");
		}
}
}
