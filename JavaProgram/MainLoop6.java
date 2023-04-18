
import java.util.Scanner;
public class MainLoop6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Value of n : ");
		int n=sc.nextInt();
		int count=1;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		System.out.println("no. of factor or divisor :"+count);
	}

}
