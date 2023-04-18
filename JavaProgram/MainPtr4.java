import java.util.Scanner;
public class MainPtr4 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the value");
		int n=s.nextInt();//5
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
	
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
