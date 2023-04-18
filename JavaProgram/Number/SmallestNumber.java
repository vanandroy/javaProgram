package Number;
import java.util.Scanner;
public class SmallestNumber {
	static int smallestNumber(int x,int y,int z)
	{
		int small=x;
		if(y<small)
		{
			small=y;
		}
		else if(z<small)
		{
			small=z;
		}
		return small;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sm=smallestNumber(a,b,c);
		System.out.println("smallest number is : "+sm);

		}

}
