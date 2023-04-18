import java.util.ArrayList;
import java.util.Collections;
public class MobilePDriver {

	public static void main(String[] args) {
		ArrayList<MobileP>a=new ArrayList<MobileP>();
		a.add(new MobileP(2345,"redmi","white"));
		a.add(new MobileP(102500,"realme","brown"));
		a.add(new MobileP(780545,"iphone","black"));
		System.out.println("Before Sorting");
		for(MobileP i: a)
			System.out.println(i);
		System.out.println("After Sorting");
		Collections.sort(a);
		System.out.println(a);

	}

}
