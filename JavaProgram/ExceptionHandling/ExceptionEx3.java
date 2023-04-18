package ExceptionHandling;
import java.util.Scanner;
public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter first number");
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}
       catch (Exception e)
		{
	 System.out.println("handled");
		}
		System.out.println("OK");
	}

}
