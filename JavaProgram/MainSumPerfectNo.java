//1.
import java.util.Scanner;
public class MainSumPerfectNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  integer value");
		int n=s.nextInt();
		
		int sum=0;
		int sum1=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(n==sum)
			{
		    sum1=sum1+n;	
				System.out.println(" Perfect Number :"+sum1);	
			}
			else 
			{
				System.out.println(n+" Is Not a Perfect Number ");	
			}

	}

	}
