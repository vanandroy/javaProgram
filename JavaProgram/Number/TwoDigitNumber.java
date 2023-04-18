package Number;
import java.util.Scanner;
public class TwoDigitNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n<10 || n>99)
			System.out.println("integer is not Two digit number");
		else
			System.out.println("integer is  Two digit number");

	}

}
