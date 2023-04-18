package Number;

import java.util.LinkedHashSet;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		int[] a= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer s:set) {
			System.out.print(s+" ");
		}

	}
}
