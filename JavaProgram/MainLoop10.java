import java.util.Scanner;
public class MainLoop10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		boolean r=isEvenNumber(n);
			if (r==true)
				System.out.println(n+"is a Even Number");
				
	else
					System.out.println(n+"is a Odd Number");
					
}
	
		static boolean isEvenNumber(int x) {
			
			for (int i=1;i<=x;i++) 
			{
				if(x%2==0)
				
					return true;
			
					
		}
			return false;
	}
}


