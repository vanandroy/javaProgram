//2.
import java.util.Scanner;
public class MainPower {
	static int isPowerOfNum(int x,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*x;
			p--;
		}
		return prod;
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value");
	int n=s.nextInt();
	int m=s.nextInt();
	int pw=isPowerOfNum(n,m);
	System.out.println(pw);

	}

}
