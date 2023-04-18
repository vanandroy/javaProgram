class Pld
{
public static void main(String [] args)
{
Player a=new Player("prem",10,"cricket");
System.out.println("player name is  "+ a.getPname());
a.setPname("amit");
System.out.println("player name is  "+ a.getPname());

System.out.println("player nop is  "+ a.getNop());
a.setNop(13);
System.out.println("player nop is  "+ a.getNop());

System.out.println("game type is  "+ a.getGameType());
a.setGameType("hockey");
System.out.println("player game type is  "+ a.getGameType());

}}