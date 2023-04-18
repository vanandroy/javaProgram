import java.util.Scanner;
class Ds
{
	public static void main(String[] a)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=s.nextInt();
		int sum1=0;
		do{
			int r=n%10;
			 sum1=sum1+r;
			n=n/10;
		}while(n!=0);
		System.out.println(sum1);

	}
}



