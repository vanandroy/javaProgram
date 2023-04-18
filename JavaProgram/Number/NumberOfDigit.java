package Number;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int count=0;
		do {
			int x=n%10;
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);

	}

}
