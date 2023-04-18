package RArray;

public class NthBiggest {
	public static int nthBiggest(int[]ar,int n) {
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}
		System.out.println(n+" th biggest is not there");
		return 0;
	}

	public static void main(String[] args) {
		int ar[]= {10,11,12,13,14};
		int big=nthBiggest(ar, 3);
		System.out.println("3rd biggest :"+big);

	}

}
