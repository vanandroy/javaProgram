package RArray;


class NthBiggestAndNthMinimum {
	public static void main(String []args) {
		int ar[]= {1,2,3,4,5,6};
		int k=3;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) //use < for maximum and > for minimum
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(k+"rd maximum is : "+ar[i]);
			break;
			}
		}
	}
}