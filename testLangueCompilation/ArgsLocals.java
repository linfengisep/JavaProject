public class ArgsLocals{
   public int run(int a,int b){
      return a*b ;
   }
   public static void main(String[]args){
      int c=3,d=5,e=0;
      ArgsLocals argslocals=new ArgsLocals();
      e=argslocals.run(c,d);
      System.out.println("e := "+e);
   }
}
