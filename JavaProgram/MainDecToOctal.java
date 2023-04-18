import java.util.Scanner;
public class MainDecToOctal {
static String isDecToOctal(int dec) {
	String oct="";
	do {
		int r=dec%8;
		oct=r+oct;
		dec=dec/8;
	}while(dec!=0);
	return oct;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal value");
		int n=sc.nextInt();
		String dto=isDecToOctal(n);
		System.out.println(dto);

	}

}
