package Number;

import java.util.Scanner;

public class Factorial {
	public static int isFactorial(int f) {
		int fact=1;
		for(int i=f;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int n=sc.nextInt();
		int ft=isFactorial(n);
			System.out.println("Factorial of "+n+" is "+ft);
		

	}

}
