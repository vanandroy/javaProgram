package ExceptionHandling;
import java.util.Scanner;
public class ExceptionEx4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("enter the index value of array");
	int d=sc.nextInt();
	try {
		System.out.println("print the value :"+ar[d]);
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("handled");
	}
	catch(ArithmeticException a)
	{
		System.out.println(ar[1]/ar[4]);
	}
	System.out.println("ok");
	}

}
