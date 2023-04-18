import java.util.Scanner;
public class MainBinToDec {
	static int binToDec(int bin)
	{
		int dec=0,pw=1;
		do {
			int r=bin%10;
			dec=dec+r*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the binary value");
		int n=s.nextInt();
		int bd=binToDec(n);
		System.out.println(bd);

	}

}
