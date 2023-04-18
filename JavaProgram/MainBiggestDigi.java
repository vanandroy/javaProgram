//1.
import java.util.Scanner;
public class MainBiggestDigi {
	static int isbiggest(int x)
	{
		int big=-9;
		do {
			int r=x%10;
			if(r>big)
				big=r;
			x=x/10;
		}while(x!=0);
		return big;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  the integer value");
		int n=s.nextInt();
		int bg=isbiggest(n);
		System.out.println(bg);

	}

}
