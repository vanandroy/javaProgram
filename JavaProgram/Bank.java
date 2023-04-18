//package vivek;
import java.util.Scanner;
public class Bank {
	String bname;
long accno;
String loc;

Scanner sc=new Scanner(System.in);
void print()
{
	System.out.println("Name Of Bank :");
	String bname=sc.next();
	
	System.out.println("Account Number Of Customer :");
	long accno=sc.nextLong();
	
	System.out.println("Location Of Bank :");
	String loc=sc.next();
	System.out.println("Name Of Bank :"+bname);
	System.out.println("Account Number Of Customer :"+accno);
	System.out.println("Location Of Bank :"+loc);
	
}


}
