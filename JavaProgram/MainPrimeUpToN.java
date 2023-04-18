//7.
import java.util.Scanner;
public class MainPrimeUpToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean rs=true;
		for (int j=2;j<=i/2;j++)
		{
			if (i%j==0)
			{
				rs=false;
				break;
			}
		}
		if(rs==true)
			System.out.print(i+" ");
		
	}
		
	}
		
	}


