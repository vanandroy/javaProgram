import java.util.Scanner;
class Mainptr1
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter value");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=1;j--)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	}
}