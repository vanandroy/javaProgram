import java.util.Scanner;
public class MainLoop8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Value of n : ");
		int n=s.nextInt();
		 int sum=0,rum=0;
		 for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				sum=sum+i;
				else
				rum=rum+i;
			}
         
         System.out.println("Sum of factor is"  +sum);
         System.out.println("Sum of factor is"  +rum);
	 }
		
	}
 
