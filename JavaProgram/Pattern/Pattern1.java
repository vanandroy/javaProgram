package Pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//System.out.print("*");
				System.out.print(j%2+" ");
				//System.out.print(i%2+" ");


			}
			System.out.println();	
			//output
//			1 0 1 0 1 
//			1 0 1 0 1 
//			1 0 1 0 1 
//			1 0 1 0 1 
//			1 0 1 0 1 
		}

	}

}

