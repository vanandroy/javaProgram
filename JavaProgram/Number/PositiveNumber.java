package Number;
import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		if(n<0)
		{
			n=n*-1;
		}
		System.out.println("entered no. is positive : "+n)	;

	}

}
