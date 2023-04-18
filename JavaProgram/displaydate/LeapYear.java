package displaydate;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  year  value");
	int a=sc.nextInt();
	if(a%400==0||(a%4==0&&a%100!=0))
		System.out.println(a+" is leap year");
	else
		System.out.println(a+" is not leap year");

	}

}
