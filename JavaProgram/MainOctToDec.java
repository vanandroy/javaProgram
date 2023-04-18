import java.util.Scanner;
public class MainOctToDec {
	static int octToDec(int oct)
	{
		int dec=0,pw=1;
		do {
			int r=oct%10;
			dec=dec+r*pw;
			pw=pw*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter octal value");
		int n=s.nextInt();
		int od=octToDec(n);
		System.out.println(od);

	}

}
