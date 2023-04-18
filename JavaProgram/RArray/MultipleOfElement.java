package RArray;
import java.util.Scanner;
public class MultipleOfElement 
{
	static int multipleOfElement(int []x)
	{
		int mul=1;
		for(int i=0;i<x.length;i++)
		{
			mul=mul*x[i];
		}
		return mul;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int mulp=multipleOfElement(ar);
		
		System.out.println("multiple of element "+mulp);
		
	}

}
