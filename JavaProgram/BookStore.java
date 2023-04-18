class BookStore
{
private String bname;
private float price;
private String author;
int bid;
public String getBname()
{
return bname;
}
public float getPrice()
{
return price;
}
public String getAuthor()
{
return author;
}
public void setPrice(float price)
{
this.price=price;
System.out.println("price updated successfully");
}
public BookStore(int bid,String author,String bname, float price)
{
this.bid=bid;
this.author=author;
this.bname=bname;
this.price=price;
}
}
