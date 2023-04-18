import java.util.ArrayList;
public class CollectionEx1 {

	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(100);
		al.add("java");
		al.add("SQL");
		al.add(120.8f);
		al.add(true);
		al.add("SQL");
		System.out.println(al);//[.............] 
		System.out.println("printing using for each loop");
		for(Object i:al)
		{
			System.out.println(i);
		}
		
	}//main ends

}//class ends
