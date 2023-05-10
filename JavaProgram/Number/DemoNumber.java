package Number;

public class DemoNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7};
		int[] c=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&& i<b.length) {
			c[k]=b[i];
			k++;
			c[k]=a[i];
			i++;
			k++;
		}
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		for(int j=0;j<c.length;j++) {
			System.out.print(c[j]+" ");
		}
	}
}
