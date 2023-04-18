package Pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter integer value");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		//System.out.print(i+" ");
		//System.out.print((char)(j+64)+" ");
		//System.out.print((char)(i+96)+" ");
		System.out.print((char)(97)+" ");
	}
	System.out.println();
}
	}

}
