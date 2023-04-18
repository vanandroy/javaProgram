import java.util.Scanner;
public class MainSquare {
     static int sumOfSquareOfDigit(int x)
     {int sum=0;
     do {
    	 int r=x%10;
    	 sum=sum+r*r;
    	 x=x/10;
    	 }
     while (x!=0);
    	 return sum;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of n : ");
		int n=sc.nextInt();
		int sq=sumOfSquareOfDigit(n);
		System.out.println("The Sum Of Square Of Digit : "+sq);

	}

}
