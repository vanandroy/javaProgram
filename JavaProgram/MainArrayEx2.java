import java.util.Scanner;
public class MainArrayEx2 {
	static int sumOfElementOfArray(int []x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("user entered array");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]+" ");
		}
		int sm=sumOfElementOfArray(ar);
		System.out.println("sum Of Element Of Array "+sm);
		
	}

}
