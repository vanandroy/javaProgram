package TY_Prog;

public class Q8_SumOfFirst3MinNumb {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,0,5,5};
		int s1=isMinimum(a, 1);
		int s2=isMinimum(a, 3);
		 
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	public static int isMinimum(int a[],int n) {
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]) {
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
