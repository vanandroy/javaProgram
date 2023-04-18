import java.util.Scanner;
public class ArraySizeDynamically {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int k=s.nextInt();
		int a[]=new int[k];
		System.out.println("enter the element of the array");
		for(int i=0;i<k;i++) //k is the size 
		{
			a[i]=s.nextInt();
		}
		System.out.println("array elements are");
		for(int e:a)
		{
			System.out.println(e);
		}
	
	}
}

