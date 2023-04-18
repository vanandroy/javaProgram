package RArray;
import java.util.Scanner;

public class SmallestElementOfArray 
{
	static int smallestElement(int []x)
	{
		int small=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<small)
			small=x[i];
		}
		
	return small;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int sml=smallestElement(ar);
		System.out.println("smallest element of array is :"+sml);
			
		

	}

}
