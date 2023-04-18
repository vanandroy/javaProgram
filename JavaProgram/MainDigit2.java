import java.util.Scanner;
public class MainDigit2 {
    static int countDigit(int x)
    {
    	int count=0;
    do {
    	x=x/10;
    	count++;
    }
    while(x!=0);
    	return count;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		
		int n1=countDigit(n);
		System.out.println("Number Of Digit Is : "+n1);

	}

}
