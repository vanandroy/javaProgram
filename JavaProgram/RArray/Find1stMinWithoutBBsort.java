package RArray;

public class Find1stMinWithoutBBsort {
	public static void main(String[] args) {
		int[] a= {5,4,0,1,3};
		int fMin=a[0];
		for(int i=0;i<a.length;i++) 
		{
				if(a[i]<fMin) {
					fMin=a[i];
				}
			}
		System.out.println(" 1st Minimum is :"+fMin);
		}
}
