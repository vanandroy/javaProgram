package TY_Prog;

public class Q2_ProdOfFirst3rdMax {
	
	public static void main(String[] args) {
		
		int a[]= {7,-3,0,2,1,9};
		int s1=isMaximum(a, 1);
		int s2=isMaximum(a, 2);
		int s3=isMaximum(a, 3);
		
		System.out.println(s1+s2+s3);
		
	}
	
	public static int isMaximum(int a[],int n) {
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					count++;
				}
			}
			if(count==n-1) {
				 return a[i];
			}
		}
		return 0;
		
	} 

}
