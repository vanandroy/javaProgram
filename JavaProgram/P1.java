import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer value");
		int n=s.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				sum=sum+i;
			if(n==sum)
			{
				System.out.println(n+" Is a Perfect Number ");	
			}
			
		}

	}

}
