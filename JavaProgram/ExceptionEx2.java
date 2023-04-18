
public class ExceptionEx2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,5,8 };
		try
		{
			System.out.println(a[8]);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("out of size");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of size1");
		}
		catch(Exception e)
		{
			System.out.println("out of size2");	
		}
	}
}
