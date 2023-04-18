package String;

import java.util.Scanner;

public class ReverseOFSentence {

	public static void main(String[] args) {
	/*	String s= "abcdefghijklmn";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(" ");
			for (int j = i+1; j < s.length(); j++) {
				
				System.out.print(s.charAt(i)+""+s.charAt(j));
				i++;
				break;
			}
		}*/
	for(;;)	
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		/*do {
			int r=n%10;
			p=p*r;
			n=n/10;
		}while(n!=0);
		*/
		
		/*
		   while(n>0) {
		 
			int r=n%10;
			p=p*r;
			n=n/10;
		}
	*/
	   /* 
		for(int i=n;i>0;i--) {
	    	  fact=fact*i;
	      }
		System.out.println(fact);
		
		while(n>0)
		{
			fact=fact*n;
			n--;
		}*/
		do
		{
			fact=fact*n;
			n--;
		}
		while(n>0);
		System.out.println(fact);
	}
    }
	}

