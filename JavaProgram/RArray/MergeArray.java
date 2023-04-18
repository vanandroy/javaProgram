package RArray;
import java.util.Scanner;
public class MergeArray {
	int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();

		int[] ar=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void displayArray(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	public int[] merge(int[] x,int[] y)
	{
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}
	public static void main(String[] args) {
		MergeArray ao=new MergeArray();
		System.out.println("read the first array : ");
		int x[]=ao.readArray();
		System.out.println("read the second array : ");
		int y[]=ao.readArray();
		System.out.println("user entered first array : ");
		ao.displayArray(x);
		System.out.println("user entered second array : ");
		ao.displayArray(x);
		int z[]=ao.merge(x, y);
		System.out.println("merged array");
		ao.displayArray(z);
	}

}
