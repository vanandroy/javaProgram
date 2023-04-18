
import java.util.Scanner;
public class MainLoop4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Value");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
			System.out.println("sum of first"+n+"natural number is :"+sum);
	}

}
