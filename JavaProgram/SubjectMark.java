import java.util.Scanner;

public class SubjectMark 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter four subject marks ");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int s=sc.nextInt();
		
		if
		(p<35||q<35||r<35||s<35)
		System.out.println("Fail");
		else
			System.out.println("pass");	
		
		
	}

}
