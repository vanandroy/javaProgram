package Number;

public class Find1stAnd2ndMinNoWithoutUsingBBsort {
	public static void main(String[] args) {
		int[] a= {5,3,0,1,4,-1,-3};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin) {
				smin=a[i];
			}
		}
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<fmin) {
//				if(a[i]!=fmin) {
//					smin=fmin;
//				}
//				fmin=a[i];
//			}else if(fmin==smin||smin>a[i]) {
//				smin=a[i];
//			}
//			
//		}
		System.out.println("1st min number is :"+fmin);
		System.out.println("2nd min number is :"+smin);
	}

}
