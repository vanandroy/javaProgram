package displaydate;
import java.util.Scanner;
public class ValidMonthNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number");
		int m=sc.nextInt();
		if(m>12||m<1)
			System.out.println("Invalid month number");
		else 
			System.out.println("Valid month number");
	}

}
