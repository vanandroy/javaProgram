import java.util.Scanner;
public class MainDecToBin {
	static String isDecToBin(int dec)
	{
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
			}while(dec!=0);
		return bin;
	}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter one decimal value");
int n=sc.nextInt();
String db=isDecToBin(n);
System.out.println(db);
	}

}
