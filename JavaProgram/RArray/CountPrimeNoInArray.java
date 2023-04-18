package RArray;
import java.util.Scanner;
public class CountPrimeNoInArray
{ 
	 int[] readArray()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	
	int ar[]=new int[n];
	System.out.println("enter"+n+"values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	return ar;
	
	}
	
	 void displayArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++) 
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
			
	}
	public int countPrime(int[] ar) 
	{
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		boolean rs=isPrime(ar[i]);
		if(rs==true)
			count++;
	}
	return count++;
	}
	boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		CountPrimeNoInArray ao=new CountPrimeNoInArray();
		int x[]=ao.readArray();
		System.out.println("user entered array");
		ao.displayArray(x);
		int pc=ao.countPrime(x);
		System.out.println("no.of Prime Number in the array "+pc);
	}

}
