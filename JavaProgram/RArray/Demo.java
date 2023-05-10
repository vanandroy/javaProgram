package RArray;

import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		
		int[] ar= {3,4,1,1,7,9,3,17,17};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		for(int i:set) {
			int count=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]==i) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(i+" ---->"+count);
			}
		}
		}
	}