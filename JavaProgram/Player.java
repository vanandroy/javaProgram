class Player
{
private String pname;
private int nop;
private String gametype;

 public String getPname()
 {
 return pname;
 }
 public void setPname(String pname)
 {
 this.pname=pname;
 System.out.println("pname is updated");
 }
 public int getNop()
 {
 return nop;
 }
 public void setNop(int nop)
 {
 this.nop=nop;
  System.out.println("no.of player is updated");
 }
 public String getGameType()
 {
 return gametype;
 }
 public void setGameType(String gametype)
 {
 this.gametype=gametype;
 System.out.println("gametype is updated");
 }
public Player(String pname,int nop,String gametype)
{
this.pname=pname;
this.nop=nop;
this.gametype=gametype;
}
}