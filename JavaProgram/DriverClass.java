import java.util.ArrayList;
public class DriverClass {

	public static void main(String[] args) {
	ArrayList<Object>a=new ArrayList<Object>();
	a.add(new Sbi23(1234567l,"rk",123455l));
	a.add(new ICICI(147852369l,"bengaluru",789.45d));

	for (Object i:a)
		System.out.println(i);
	}

}
