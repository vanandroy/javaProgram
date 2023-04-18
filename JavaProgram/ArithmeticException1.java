import java.util.Scanner;
public class ArithmeticException1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("enter first number");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			System.out.println("enter second number");
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("HANDLED");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arry");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Okay");
		}
			
		

	}

}
