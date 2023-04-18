class Xyz
{
public static void main(String [] args)
{
BookStore bs=new BookStore(101,"JohnAlex","SQL Skills",600f);
System.out.println("Book price is "+bs.getPrice());
bs.setPrice(750f);
System.out.println("Book price is "+bs.getPrice());
System.out.println("Book name is "+bs.getBname());
System.out.println("Book Author is "+bs.getAuthor());
System.out.println("Book id is "+bs.bid);
    //System.out.println("Book id is "+bs.Price);
}
}