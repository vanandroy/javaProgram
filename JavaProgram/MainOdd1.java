//4.
import java.util.Scanner;
public class MainOdd1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the integer value");
	int n=s.nextInt();
	
	
	for( int i=n;i>=1;i--)
	
		if(i%2!=0)
		{
			System.out.print(i +" ");
	}
	
	}

}
