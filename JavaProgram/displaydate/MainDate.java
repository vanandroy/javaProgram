package displaydate;
import java.util.Scanner;
public class MainDate {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date(dd mm yyyy)");
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	Date dt=new Date(dd,mm,yy);
	
String dname=dt.getDayname();
System.out.println(" Day name of the date is :"+dname);
	}

	
}

