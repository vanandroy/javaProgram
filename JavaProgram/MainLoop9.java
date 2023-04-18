import java.util.Scanner;
public class MainLoop9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Value of n : ");
		int n=s.nextInt();
		int sum1=0;
		int sum2=0;
		 for(int i=1;i<=n;i++)
			
	        if(i%2==0)
	          {
	        	  sum1=sum1+i;
	        	 
	          } 
	        else
	          {
	        	  sum2=sum2+i;
	        	 
	          }
		 System.out.println(sum1);
		 System.out.println(sum2);
		 System.out.println(sum1+sum2);
	 }
		
	}
 
