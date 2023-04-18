package RArray;

public class SortArrayAscOrderUsingBBSort {
	public static void main(String []args) {
		int[] a= {5,4,0,1,3};
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
