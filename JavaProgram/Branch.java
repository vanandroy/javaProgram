
import java.util.Scanner;
public class Branch extends Bank 
{
	int empno;
	String brname;

	Scanner sc=new Scanner(System.in);
	
	void display()
	{
		System.out.println("enter number of employee :");
		int empno=sc.nextInt();
		System.out.println("branch name of bank is :");
		String brname=sc.next();
		System.out.println("Number of employee :"+ empno);
		System.out.println("Branch name of bank is :"+brname);

	}

}
