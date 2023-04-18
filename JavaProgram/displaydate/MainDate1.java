package displaydate;
import java.util.Scanner;
public class MainDate1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first date(dd mm yyyy)");
		int dd1=sc.nextInt();
		int mm1=sc.nextInt();
		int yy1=sc.nextInt();
		Date dt1=new Date(dd1,mm1,yy1);
		System.out.println("enter the second date(dd mm yyyy)");
		int dd2=sc.nextInt();
		int mm2=sc.nextInt();
		int yy2=sc.nextInt();
		Date dt2=new Date(dd2,mm2,yy2);
		int diff=dt2.countNoOfdays()-dt1.countNoOfdays();
		System.out.println("Number of days b/w these two dates:  "+diff);
		
	}

}
