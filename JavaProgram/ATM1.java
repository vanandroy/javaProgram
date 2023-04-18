interface ATM1
{
static final String company="Cisco";
void withdrawMoney();
void changePin();
void printStmt();

static void welcome()
{
System.out.println("welcome");
}
}