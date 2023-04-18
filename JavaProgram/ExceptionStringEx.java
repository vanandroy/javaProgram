
public class ExceptionStringEx {

	public static void main(String[] args) {
		System.out.println("START");
		
		String add="Bengaluru";
		
		
		try
		{
			for(int i=0;i<=add.length();i++)
			{
			System.out.print(add.charAt(i));
			}
			System.out.print(add.toUpperCase());
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception Occured,Continue");
		}
		
		
		System.out.println(add);
		
		System.out.println(add.toLowerCase());
		System.out.print(add.toUpperCase());
		

	}

}
