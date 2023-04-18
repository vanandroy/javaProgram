package RArray;

public class AdditionOf2Arrays {
	public static void main(String[] args) {
		int[] a= {4,3,2,5};
		int[] b= {3,1,5,6,7};
		//O/P={7,4,7,11,7}
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
	}
	for(int i=0;i<length;i++) {
		try {
			System.out.print(a[i]+b[i]+" ");
		}catch(Exception e) {
			if(a.length<b.length) {
				System.out.print(b[i]);
			}else {
				System.out.print(a[i]);
			}
		}
	}
		
	}
}
