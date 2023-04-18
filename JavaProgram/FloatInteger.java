import java.util.Scanner;
public class FloatInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four float point value");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float d=sc.nextFloat();
		if
		(a>b&&a>c&&a>d)
		{
			System.out.println(a+": is biggest");
		}
		else if
		(b>a&&b>c&&b>d)
		{
			System.out.print(b+": is biggest");
		}
		else if
		(c>a&&c>b&&c>d)
		{
			System.out.print(c+": is biggest");
		}
		else 
		{
			System.out.print(d+": is biggest");
		}
	}

}
