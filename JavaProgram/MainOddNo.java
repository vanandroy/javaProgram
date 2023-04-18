import java.util.Scanner;
class MainOddNo
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer value : ");
int n=sc.nextInt();
for (int i=n;i>=1;i--)
{	
	
if(i%2!=0)
System.out.print(i+" ");
}
}
}