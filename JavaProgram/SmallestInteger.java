import java.util.Scanner;
public class SmallestInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		if
		(p<q&&p<r)
		{
			System.out.println(p+" : is smallest");
		}
		else if
		( q<p&&q<r)
		{
			System.out.println(q+": is smallest");
		}
		else
		{
			System.out.println(r+": is smallest");
		}
	}

}
