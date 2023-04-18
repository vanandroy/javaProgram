package Number;

public class MultiplicationOf1st3MinNoWithoutUsingBBsort {
	public static void main(String[] args) {

		int[] a= {-2,-3,1,-1,5,4};
		int fmin=a[5];
		int smin=a[5];
		int tmin=a[5];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<fmin) 
			{
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}else if(a[i]<smin)
			{
				smin=a[i];
			}
			else if(a[i]<tmin) {
				tmin=a[i];
			}
		}

		System.out.println("1st Min :"+fmin);
		System.out.println("2nd Min :"+smin);
		System.out.println("3rd Min :"+tmin);
		int mul=fmin*smin*tmin;
		System.out.println("multiplictaion of 1st 3rd min is :"+mul);
	}

}
