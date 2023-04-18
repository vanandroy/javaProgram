import java.util.Scanner;
public class MainLoop3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Value");
		int n=sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
