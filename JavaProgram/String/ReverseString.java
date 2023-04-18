package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		//String str="vivek";
		/*
		 String rev=" ";
		int count=str.length();
		for(int i=count-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of "+str+" is "+rev);
		*/
		 //code for reverse sentence as well as word
		 String[] word=str.split(" ");
		String reverseString="";
		for(String w:word) {
			String reverseWord = " ";
			for(int i=w.length()-1;i>=0;i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println("Reverse of "+str+" is "+reverseString);
		 

	}

}
