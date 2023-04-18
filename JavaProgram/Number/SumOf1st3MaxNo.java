package Number;


public class SumOf1st3MaxNo {
	public static void main(String[] args) {
		int[] a= {5,4,0,1,3};
		int fmax=0;
		int smax=0;
		int tmax=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}else if(a[i]>smax) {
				tmax=smax;
				smax=a[i];
			}else if(a[i]>tmax) {
				tmax=a[i];
			}
		}
		System.out.println("1st 3 max are :"+fmax+" "+smax+" "+tmax);
		System.out.println("sum of 1st 3 max :"+(fmax+smax+tmax));
		
}
}
