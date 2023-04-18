import java.util.Scanner;
class MainPrimeno
{
public static void main(String[] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter value");
int n=s.nextInt();
int count=0;
do{
int r=n%10;
for(int i=2;i<=n/2;i++)
{
if(r%i!=0)
count++;
}
n=n/10;
}while(n!=0);
System.out.println(count);
}
}