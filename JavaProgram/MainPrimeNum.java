import java.util.Scanner;
class MainPrimeNum

{
public static void main(String[] z)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
System.out.println(n);
while(n!=0)
{
boolean k=isPrime(n);
if(k==true)
System.out.println(n+"is a primeNum");
n--;
}
}
static boolean isPrime(int x)
{
for(int i=2;i<x/2;i++)
{
if(x%i==0)
{
return false;
}
}
return true;

}

}

