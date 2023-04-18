class Method13
{
public static void main(String [] args)
{
int c=67;
int p=98;
int m=79;
int b=97;
   int s=  total (c,p,m,b);
   perc (s);
}
public static int total(int c,int p,int m,int b)
{
int t = c+p+m+b;
perc(t);
return(t);
}
public static void perc(int sum)
{
float p=sum/400f*100f;
System.out.println("total marks is ="+sum);
System.out.println("percentage ="+p);
}
}