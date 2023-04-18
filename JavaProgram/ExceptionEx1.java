import java.util.Scanner;
public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three integer value :");
		int m=s.nextInt();
		int n=s.nextInt();
		int p=s.nextInt();


try
{
	System.out.println(m/n);
	System.out.println(n/p);
	
}
catch
(ArithmeticException e)
{
	System.out.println("never divide integer by zero");
}
	}

}
