package displaydate;
import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number");
		int m=sc.nextInt();
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			System.out.println("31 Days in the month");
		else if(m==4||m==6||m==9||m==11)
			System.out.println("31 Days in the month");
		else if(m==2)
		System.out.println("28 or 29 Days in the month");
		else
			System.out.println("Invalid Month Number");
			

	}

}
