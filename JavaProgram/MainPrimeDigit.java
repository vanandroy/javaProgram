import java.util.Scanner;
public class MainPrimeDigit {
	
public static void main(String[] a)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter value");
	int n=s.nextInt();
	  
	/* int sum=0;
	   do {
		   int r=n%10;
		   sum=sum+r;
		   n=n/10;
		   
	   }while(n!=0);
	   System.out.println(sum);
	 
	3.*/
	  int big=0;
	 
	int small=99;
	do {
		int r=n%10;
		if(r>big)
			big=r;
		if(r<small)
			small=r;
		n=n/10;
	}while(n!=0);
	 System.out.println(big+small);

}


}