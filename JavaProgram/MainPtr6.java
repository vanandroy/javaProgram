import java.util.Scanner;
public class MainPtr6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i-1;j--)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k +"  ");
			}
		
		System.out.println( );
		}
	}

}
