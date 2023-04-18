import java.util.Scanner;
public class MainArrayEx3 
{
static int biggest(int[] x) 
{
	int big=x[0];
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>big)
			big=x[i];
	}

	return big;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<=ar.length-1;i++)
		{
			ar[i]=sc.nextInt();
		}
System.out.println("entered array element");
for(int i=0;i<ar.length;i++)
{
	System.out.print(ar[i]+" ");
}
int big=biggest(ar);
System.out.println("biggest element of array is : "+big);

	}

}
