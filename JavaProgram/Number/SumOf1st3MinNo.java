package Number;


public class SumOf1st3MinNo {
	public static void main(String[] args) {

		int[] a= {5,4,1,0,3};
		int fmin=a[4];
		int smin=a[4];
		int tmin=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}else if(a[i]<smin) {
				tmin=smin;
				smin=a[i];
			}else if(a[i]<tmin) {
				tmin=a[i];
			}
		}
		System.out.println("1st 3 min are :"+fmin+" "+smin+" "+tmin);
		System.out.println("sum of 1st 3 Min number is:"+(fmin+smin+tmin));
	}
}
