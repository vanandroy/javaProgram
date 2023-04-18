package RArray;
import java.util.Scanner;

public class BiggestElementOfArray 
{
	static int biggestElement(int []x)
	{
		int big=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>big)
				big=x[i];
		}
		return big;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of Array");
	int n=sc.nextInt();
	
	int ar[]=new int[n];
	System.out.println("enter "+n+" values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	
	int bg=biggestElement(ar);
	
	System.out.println("biggest elemnet of array :"+bg);

	}

}
