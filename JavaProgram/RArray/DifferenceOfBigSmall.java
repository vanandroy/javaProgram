package RArray;
import java.util.Scanner;
class DifferenceOfBigSmall

{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		int big=ar[0],small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>ar[0])
				big=ar[i];
			else
				small=ar[i];
		}
		System.out.println("big "+big);
		System.out.println("small "+small);
		int diff=big-small;
		System.out.println("big- small :"+diff);
	}
}