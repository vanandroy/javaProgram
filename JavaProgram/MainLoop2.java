import java.util.Scanner;
public class MainLoop2 {

	private static int i;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		/*for (int i=n;i>=1;i--)
		{
			System.out.println(i);
		} */
		/*int i=n;
		 while (i>=0)
		 {
			 System.out.println(i);
			 i--;
		 }
*/
			for (;n>=1;n--)
		{
			 System.out.println(n);
		}
		
	}

}
