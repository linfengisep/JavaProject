public class GiveChange{
   static class Change{
      long coin2 = 0;
      long bill5 = 0;
      long bill10 = 0;
   }
/*
   static Change optimalChange(long s){
      Change change = new Change();
      change.bill10 = s/10;
      switch((int)s%10){
         case 0:break;
         case 1:change = null;break;
         case 2:change.coin2 = 1;break;
         case 3:change = null;break;
         case 4:change.coin2 = 2; break;
         case 5:change.bill5 = 1; break;
         case 6:change.coin2 = 3; return change;
         case 7:change.coin2 = 1; change.bill5 = 1;break;
         case 8:change.coin2 = 4; break;
         case 9:change.coin2 = 2; change.bill5 = 1;break;
         default: break;
      }
      return change;
   }
*/

   static Change optimalChange(long s) {
    long change = s;
    Change c = new Change();
    //大于5的基数；
    if (change >= 5  &&  change % 2 == 1) {
      c.bill5 = 1;
      change -= 5;
    }
    c.bill10 = change / 10;
    change = change % 10;
    c.coin2 = change / 2;
    return c;
  }
   public static void main(String[] args) {
      System.out.println("result:"+optimalChange(21).coin2);
   }
}
