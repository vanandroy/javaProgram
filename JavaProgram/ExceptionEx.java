import java.util.Scanner;
public class ExceptionEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		try
		{
			System.out.println(a/b);
			System.out.println(a/c);
			System.out.println(c/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("never divide a number by zero");
		}  
		catch(Exception e)
		{
			System.out.println("out of size1");
		}
		
		
	}

}
