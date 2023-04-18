import java.util.Scanner;
public class MainArrayEx1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n=sc.nextInt();
		double[] per=new double[n];
		System.out.println("enter "+n+" values ");
		for(int i=0;i<per.length;i++)
		{
			per[i]=sc.nextDouble();
		}
		System.out.println("In the reverse order");
		for(int i=per.length-1;i>=0;i--)
		{
			System.out.println(per[i]+" ");
		}
		

	}

}
