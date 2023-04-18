package RArray;

public class Find1stMaxWithoutBBsort {
	public static void main(String[] args) {
		int[] a= {3,4,0,1,5};
		int fmax=a[0];//int fmax=a[4];
		for(int i=0;i<a.length;i++) 
		{
				if(a[i]>fmax) {
					fmax=a[i];
				}
			}
		System.out.println(" 1st Maximum is :"+fmax);
		}
}
