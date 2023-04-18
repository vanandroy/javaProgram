import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer value");
		int i=sc.nextInt();
		if
		(i%3==0&&i%5==0)
		{
			System.out.println("SANJU weds GEETA");
		}
		else if 
		(i%3==0)
		{
			System.out.println("SANJU");
		}
		else if
			(i%5==0)
			{
			System.out.println("GEETA");
			}
		else
		{
			System.out.println("BREAKUP");
		}
		
		
	}

}
