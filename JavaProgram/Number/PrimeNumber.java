package Number;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isPrimeNumber(int x) {
		for(int i=2;i<=x/2;i++) {
         if(x%i==0)
         {
        	 return false;
         }
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		//1st way
		boolean prmno = isPrimeNumber(n);
		if(prmno==true) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
		/*
		 //2nd way
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			count++;
		}
		if(count==2)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
			
			
	}
		 */
		
	}
}
