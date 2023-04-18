package Number;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int n=sc.nextInt();
		double area=3.141*n*n;
		double circumference=2*3.141*n;
	System.out.println("area of circle "+area);
	System.out.println("circumference of circle "+circumference);

	}

}
