
import  java.util.Scanner;
class Arrayex3
{
public static void main(String[] args)
{
char[] a={'a','p','p','l','e'};
Scanner sc=new Scanner(System.in);
System.out.println("enter a char value");
char ch=sc.next().charAt(0);
for(int i=0;i<a.length;i++)
{
if(ch==a[i])
{
System.out.println("found");
break;
}
else
{
System.out.println("Not found");

}
}
}
}

