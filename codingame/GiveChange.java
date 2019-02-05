public class GiveChange{
   static class Change{
      long coin2 = 0;
      long bill5 = 0;
      long bill10 = 0;
   }

   static Change optimalChange(long s){
      Change change = new Change();
      change.bill10 = s/10;
      switch((int)s%10){
         case 0:return change;
         case 1:return null;
         case 2:change.coin2 = 1; return change;
         case 3:return null;
         case 4:change.coin2 = 2; return change;
         case 5:change.bill5 = 1; return change;
         case 6:change.coin2 = 3; return change;
         case 7:change.coin2 = 1; change.bill5 = 1;return change;
         case 8:change.coin2 = 4; return change;
         case 9:change.coin2 = 2; change.bill5 = 1;
         default: return null;
      }
   }

   public static void main(String[] args) {
      Change m = optimalChange(12377);
      System.out.println("coin2:"+m.coin2);
      System.out.println("bill5:"+m.bill5);
      System.out.println("bill10:"+m.bill10);
   }
}
