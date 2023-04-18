//2.
import java.util.Scanner;
public class MainDivisor {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.println("enter the integer value :");
int n=s.nextInt();

for (int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		System.out.print( i +"  ");
	}
	
}
	
	}

}
