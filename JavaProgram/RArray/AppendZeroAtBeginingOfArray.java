package RArray;


public class AppendZeroAtBeginingOfArray {
	
			public static void main(String[] args)
			{
				int[] ar1={1,0,2,0,3,4,0,5};
				int[] ar=new int[ar1.length];
				int n=ar1.length-1;
				for(int i=ar1.length-1;i>=0;i--) {
					if(ar1[i]!=0)
					{
						ar[n]=ar1[i];
						n--;
					}
				}
				while(n>0) {
					ar[n]=0;
					n--;
				}
				for(int i=0;i<ar.length;i++) {
					System.out.print(ar[i]+" ");
				}
			}
		}