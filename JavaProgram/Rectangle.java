class Rectangle
{
private int length;
private int breadth;

  
  public int getLength()
  {
  return length;
  }
  public int getBreadth()
  {
  return breadth;
  }
  public void setLength(int length)
  {
	  this.length=length;
  System.out.println("length is updated");
  }
  public void setBreadth(int breadth)
  {
  this.breadth=breadth;
  System.out.println("breadth is updated");
  }
  public Rectangle(int length,int breadth)
  {
  this.length=length;
  this.breadth=breadth;
  }
  public void getRectangle()
{
	int area=length*breadth;
	System.out.println("Area of Rectangle is  " + area );

}
  }