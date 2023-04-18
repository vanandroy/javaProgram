package Number;

import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome(int x) {
		int rev=0,per=x;
		do {
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}while(x!=0);
		return rev==per;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int n=sc.nextInt();
		boolean p=isPalindrome(n);
		if(p==true) {
			System.out.println(n+" is a Palindrome Number");
		}else {
			System.out.println(n+" is not a Palindrome Number");
		}
	}

}
