package ExceptionHandling;

public class ExceptionEx2 {
	public static void main(String []args)
	{
		System.out.println("Start");
		int a[]={1,2,3};
		try
		{
			System.out.println(a[8]);
		}
		catch(Exception e)
		{
			
			String msg=e.getMessage();
			System.out.println(msg);
		}
		System.out.println("End");
	}

}
