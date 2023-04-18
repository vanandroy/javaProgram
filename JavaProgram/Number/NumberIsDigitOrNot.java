package Number;
import java.util.Scanner;
public class NumberIsDigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		if(n<-9||n>9)
			System.out.println("integer is not digit");
		else
			System.out.println("integer is digit");

	}

}
