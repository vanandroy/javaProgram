package String;
//ip = my name is ok op= ko si eman ym;
public class ReverseEachWordInReversePlace {

	public static void main(String[] args) {
		String str = "my name is ok";
		for(int i=str.length()-1 ; i>=0;i--)
		{
			System.out.print(str.charAt(i)+"");
		}
		
	}
}
