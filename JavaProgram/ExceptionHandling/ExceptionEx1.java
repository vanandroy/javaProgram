package ExceptionHandling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("print");
		int a=2;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
