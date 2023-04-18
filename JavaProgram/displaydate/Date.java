package displaydate;

class Date
{
	private int dd;
	private int mm;
	private int yy;
	String name[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
	}
	public String toString()
	{
		return "Date[dd=" +dd+ ",mm=" +mm+ ",yy=" +yy+"]";
	}
	int countNoOfdays()
	{
		int y=yy-1;
		int days=y*365+y/400+y/4-y/100;
		for(int i=1;i<mm;i++)
		{
			days=days+month[i];
		}
		days=days+dd;
		return days;
	}
	public String getDayname()
	{
		int ds=countNoOfdays();
		return name[ds%7];
	}
}
