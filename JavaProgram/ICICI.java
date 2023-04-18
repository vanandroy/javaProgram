
public class ICICI {
	long accno;
	String loc;
	double bal;
	public ICICI(long accno,String loc,double bal)
	{
		this.accno=accno;
		this.loc=loc;
		this.bal=bal;
		
	}
	public String toString()
	{
		return accno+"  "+loc+"   "+bal;
	}

	

}
