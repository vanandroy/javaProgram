import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class FbAccount implements Comparable<FbAccount>
{
	String usname;
	String pass;
	long cont;
	public FbAccount(String usname,String pass,long cont)
	{
		this.usname=usname;
		this.pass=pass;
		this.cont=cont;
	}
public String toString() {
	return usname+" "+pass+" "+cont;
  
}

public int compareTo(FbAccount c)
{
if(this.usname.compareTo(c.usname)>0)
	return 1;
else if(this.usname.compareTo(c.usname)<0)
	return -1;
else
	return 0;
}

public static void main(String[] args) {
		
HashSet<FbAccount> t=new HashSet<FbAccount>();

t.add(new  FbAccount("bivashk","rk@123",12345l));
t.add(new  FbAccount("viveky","vym@123",120045l));
t.add(new  FbAccount("abhisheky","rk@123",12345l));

/*
for(FbAccount i:t)
{
	System.out.println(i);
}


Iterator<FbAccount> i=t.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
*/


TreeSet<FbAccount> y=new TreeSet(t);
for(FbAccount i:y)
{
	System.out.println(i);
}

	}

}
