package Number;

import java.util.Scanner;

public class XylemFloemNumber {
	static boolean isXylemFloem(int x) {
		int es=0,ms=0,temp=x;
		do {
			int r=x%10;
			if(x<10||x==temp) {
				es=es+r;
			}else {
				ms=ms+r;
			}
			x=x/10;
		}while(x!=0);
		return es==ms;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//1234
		boolean xyf=isXylemFloem(n);
		if(xyf) {
			System.out.println(n+" is Xylem Number");
		}
		else {
			System.out.println(n+" is Floem Number");
		}

	}

}
