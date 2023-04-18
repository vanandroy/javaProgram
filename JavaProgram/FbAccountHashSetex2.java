import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class FbAccountHashSetex2 {
	String usname;
	String pass;
	long cont;
	public FbAccountHashSetex2(String usname,String pass,long cont)
	{
		this.usname=usname;
		this.pass=pass;
		this.cont=cont;
	}
public String toString() {
	return usname+" "+pass+" "+cont;
  
}
	public static void main(String[] args) {
		
HashSet<Object> f=new HashSet<Object>();
f.add(new  FbAccountHashSetex2 ("rksy","rk@123",12345l));
f.add(new  FbAccountHashSetex2 ("vym","vym@123",120045l));




Iterator<Object> i=f.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

	}

}
