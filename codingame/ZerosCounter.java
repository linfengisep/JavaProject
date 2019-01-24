public class ZerosCounter{
   public static int zeros(int n) {
      int nbr=0;
      for(int i=5;n/i>=1;i*=5)
         nbr += n/i;
      return nbr;
   }
   public static void main(String[] args) {
      System.out.println(zeros(30));
   }
}
