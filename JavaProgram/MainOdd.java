import java.util.Scanner;
public class MainOdd {


	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the integer value : ");
 int n=sc.nextInt();
 boolean odd=oddNumber(n);
 if (odd==true)
 System.out.print(n+" is even Number  ");
 else
	 System.out.print(n+" is odd Number  ");	 
	}
	
	static boolean oddNumber(int x) {
 
 for(int i=1;i<=x;i++)
 {
		if(x%2==0);
 return true;
 }
 
	 return false;
 }
 
	

}
