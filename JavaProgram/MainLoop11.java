import java.util.Scanner;
public class MainLoop11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			/*if(i%2==0)
			{
				System.out.println( i +"  ");
			}*/
			if(i%2!=0)
			{
				System.out.println( i +"  ");
			}

	}

}
