import java.util.Scanner;
public class MainDecToHexdecimal {
	static String isDecToHex(int x) {
		String hex="";
		do {
			int r=x%16;
			if(r<10)
				hex=r+hex;
			/* 
			 else if(r==10)
			hex="A"+hex;
			else if(r==11)
			hex="B"+hex;
			else if(r==12)
				hex="C"+hex;
			else if(r==13)
				hex="D"+hex;
			else if(r==14)
				hex="E"+hex;
			else if(r==15)
				hex="F"+hex;
			x=x/16;
			*/
			else
			hex=(char)(r+55)+hex;
		x=x/16;
			}while(x!=0);
		return hex;
	}

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the decimal value");
int n=s.nextInt();
String dh=isDecToHex(n);
System.out.println(dh);

	}

}
