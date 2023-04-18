package RArray;


public class DemoArrayPrograme {
	public static void main(String []args) {
//		int[] a= {1,1,2,5,4,2,3,4};
		int a[]= {1,1,2,2,3,4,5,5,6};
		int[] c=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				c[j]=a[i];
				j++;
			}
		}
		c[j]=a[a.length-1];
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}