package Number;

import java.util.LinkedHashSet;

public class PositionOfEachNumberWithoutDuplicateNumber {
	public static void main(String[] args) {
		int[] a= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
	
		for(Integer d:set) {
			//output will be 
//			4 is present in :1 position
//			5 is present in :2 position
//			1 is present in :4 position
//			3 is present in :6 position
//			2 is present in :7 position
			for(int i=0;i<a.length;i++) {
				if(d.equals(a[i])) {
					System.out.println(d+" is present in :"+(i+1)+" position");
					break;
				}
//				for(int i=a.length-1;i>=0;i--) {
//					if(d==a[i]) {
//						System.out.println(d+" is present in :"+(i+1)+" position");
//						break;
//					}
//					4 is present in :3 position
//					5 is present in :5 position
//					1 is present in :4 position
//					3 is present in :6 position
//					2 is present in :7 position
			}
		}
	}

}
