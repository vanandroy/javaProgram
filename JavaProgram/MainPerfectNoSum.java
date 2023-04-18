//1.
import java.util.Scanner;
public class MainPerfectNoSum {
static boolean isPerfect(int x)
{
	int s=0;
	for(int i=1;i<=x/2;i++)
	{
		if(x%i==0)
			s=s+i;
	}
	return s==x;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer value :");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPerfect(i);
			if(rs==true)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}
