
public class ChildExtendsInterface implements ChildInterface {
      public int a=10;
      public String s="linfeng";
      public Boolean res = false;

      @Override
      public int getValue(){
         return a;
      }

      @Override
      public String getMessage(){
         return s;
      }

      public Boolean getResult(){
         return res;
      }
/*
      public static void main(String[]args){
      ChildExtendsInterface cd = new ChildExtendsInterface();
      System.out.println("cd.getValue()="+cd.getValue());
      System.out.println("cd.getMessage()="+cd.getMessage());
      System.out.println("cd.getResult()="+cd.getResult());
      cd.s="linfeng-Wang";
      System.out.println("*********************************");
   }
*/
}
