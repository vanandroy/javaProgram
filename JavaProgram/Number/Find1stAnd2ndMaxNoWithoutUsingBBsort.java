package Number;

public class Find1stAnd2ndMaxNoWithoutUsingBBsort {
	public static void main(String[] args) {
		int[] a= {5,3,0,1,4};
		int fmax=0;//int fmax=a[4];
		int smax=0;//int smax=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("First Max is :"+fmax);
		System.out.println("Second Max is :"+smax);
	}
}
