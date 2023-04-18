import java.util.Scanner;
class ExecuteCBI
{
public static void main(String [] args)
{
int choice=0;
CBI c=new CBI(9876548563298l,1234,234509d);
Scanner s=new Scanner(System.in);
do
{
System.out.println("Enter the option 1:withdraw  2:changepin 3:printstmt");
int option=s.nextInt();
switch(option)
{
case 1:
{
c.withdrawMoney();
}
break;
case 2:
{
c.changePin();
}
break;
case 3:
{
c.printStmt();
}
break;
}
System.out.println("Do you want continue ??? press 0 to continue,press 1 for exit");
choice=s.nextInt();
}

while(choice==0);

}
}
