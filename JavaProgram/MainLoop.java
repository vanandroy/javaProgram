import java.util.Scanner;
public class MainLoop {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter the range");
	int n=sc.nextInt();
	
	/*for(int i=1;i<=n;i++)
	{
		System.out.println(i);
	}
	*/
	int i=1;
	while (i<=n)
	{
		System.out.println(i);
		i++;
	}

	}

}
