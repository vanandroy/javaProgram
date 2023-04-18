import java.util.Scanner;
public class MainDecToHex {
	static String decToHex(int dec)
	{
		String hx=" ";
		do {
			int r=dec%16;
			if(r<10)
				hx=r+hx;
			else
				hx=(char)(r+55)+hx;
			dec=dec/16;
		}while(dec!=0);
		return hx;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the decimal value");
  int n=s.nextInt();
  String con=decToHex(n);
  System.out.println(con);
	}

}
