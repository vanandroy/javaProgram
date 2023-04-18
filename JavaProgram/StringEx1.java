
public class StringEx1 {

	public static void main(String[] args) {
		String s="Bengaluru";
		int l=s.length();
		//String n=new String("Karnataka");
		String t="Karnataka";
		int j=t.length();
		System.out.println("Length of the given literal is" + l);//9
		System.out.println("Counted String literal is " + s.toUpperCase());
		System.out.println("Counted String literal is " + s.toLowerCase());
		System.out.println(s.equals("Bengaluru"));//true
		System.out.println("Length of the given literal is" + j);//9
		System.out.println(t.equalsIgnoreCase("KARNATAKA"));//true
		System.out.println("Counted String literal is " + t.toUpperCase());
		System.out.println("Counted String literal is " + t.toLowerCase());
		System.out.println(t.equals("Bengaluru"));//false
		System.out.println(t.equals(t));//true
		System.out.println(t.equals("Karnataka"));//true
		System.out.println(s==t);//false
		
		char c=t.charAt(4);
		System.out.println("character at index 4 is" + c);//a
		int r=t.indexOf('a');
		System.out.println("index of a is" + r);//1
		int y=t.indexOf('p');
		System.out.println("index of p is" + y);//-1
		
		String u="india";
		System.out.println(u.equalsIgnoreCase("india"));//true
		System.out.println(u.equalsIgnoreCase("delhi")); //false
		String at=t.trim();
		System.out.println(at);//Karnataka
		
		//System.out.println(t.charAt(12));
		System.out.println("hello");
		System.out.println(t.substring(3)); //nataka
		System.out.println(t.substring(3,7));//nata
		System.out.println(t.substring(0,3)); //kar
		
	}

}
