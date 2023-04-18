import java.util.Scanner;
class MainPrimeCount1
{
public static void main(String[] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter value");
int n=s.nextInt();
int p=0;

  
 do {   int count=0;
	 int r=n%10;
	 for(int i=2;i<=r/2;i++)
	 {
		 if(r%i==0)
			 count++;
	 }
	 if(count==0)
		 p++;
	 n=n/10;
 }while(n !=0);

System.out.println(p);
}
}