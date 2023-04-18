package RArray;
import java.util.Scanner;
public class MergeInZigZagOrder {
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int []ar=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void displayArray(int []ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println(" ");
	}
	int[] zigZagArray(int []x,int []y)
	{
		int []z=new int[x.length+y.length];
		int i=0, k = 0;
		while(i<x.length&&i<y.length)
		{
		z[k]=x[i];
		k++;
		z[k]=y[i];
		i++;
		k++;
		}
		while(i<x.length)
		{
			z[k]=x[i];
			k++;
			i++;
		}
		while(i<y.length)
		{
			z[k]=y[i];
			k++;
			i++;
		}
		return z;
	}

	public static void main(String[] args) {
		MergeInZigZagOrder ao=new MergeInZigZagOrder();
		System.out.println("read the first array");
		int x[]=ao.readArray();
		System.out.println("read the second array");
		int y[]=ao.readArray();
		int z[]=ao.zigZagArray(x,y);
		System.out.println("zig-zag array");
		ao.displayArray(z);
	}

}
