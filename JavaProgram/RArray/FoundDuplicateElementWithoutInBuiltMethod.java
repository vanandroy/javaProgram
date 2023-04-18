package RArray;

public class FoundDuplicateElementWithoutInBuiltMethod {

	public static void main(String[] args) {
		String arr[]= {"java","String","java","book","book"};
		int size = arr.length;
		Boolean t=false;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]) {
					System.out.println("duplicate is :"+arr[i]);
					t=true;
				}
			}
		}
		if(t==false) {
			System.out.println("no duplicate found");
		}
	}

}
