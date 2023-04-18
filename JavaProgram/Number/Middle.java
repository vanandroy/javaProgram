package Number;
import java.util.Scanner;
public class Middle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three distinct number");
		int a=sc.nextInt();//29 or 31
		int b=sc.nextInt();//30 or 30
		int c=sc.nextInt();//31 or 29
		if((a<b&&c<a)||(b<a&&a<c))
			System.out.println(a+"  is the middle value");
		else if((a<b&&b<c)||(b<a&&c<b))
			System.out.println(b+"  is the middle value");
		else
			System.out.println(c+"  is the middle value");

	}

}
