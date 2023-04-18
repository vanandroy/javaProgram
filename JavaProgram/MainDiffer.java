import java.util.Scanner;
public class MainDiffer {
static int diffOfBiggAndSmallDigit(int x) {
	int big=-9;
	int small=9;
	do {
		int r=x%10;
		if(r>big)
			big=r;
		if(r<small)
			small=r;
		x=x/10;
		}
		while(x!=0);
		
		return big-small;
		
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		int diff=diffOfBiggAndSmallDigit(n);
		System.out.println("Difference Of Biggest And Smallest Digit Of "+n+" is "+diff);
		


		
}

}
