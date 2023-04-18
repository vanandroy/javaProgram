import java.util.Scanner;
class MainEvenOdd
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer value");
int n=sc.nextInt();
int count1=0;
int count2=0;
for (int i=0;i<=n;i++)
if(i%2==0)
{
count1++;
}
else
count2++;

System.out.println("no of even :"+count1);
System.out.println("no of odd "+count2);
}
}