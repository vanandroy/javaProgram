package Number;
import java.util.Scanner;

public class PerfectNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int a=sc.nextInt();
			int pfn = perfectNumber(a);
			System.out.println(pfn);
			if(pfn==a)
			{
				System.out.println(a+" is a perfect number");
			}
			else {
				System.out.println(a+" is not a perfect number");
			}
		}

		static int perfectNumber(int x) {
			int sum=0;
			for(int i=1;i<=x/2;i++) 
			{
				int y=x%i;
				if(y==0) 
				{
					sum=sum+i;
				}
			}
			return sum;
		}
	}


