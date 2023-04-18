package Number;
import java.util.Scanner;
public class BiggestNumber {
	static int biggestNumber(int x,int y,int z)
	{
		int big=x;
		if(y>big)
		{
			big=y;
		}
		else if(z>big)
		{
			big=z;
		}
		return big;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter three integer value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int bg=biggestNumber(a,b,c);
	System.out.println("Biggest number is : "+bg);

	}

}
