
public class LambdaExpressionTester{
   public static void main(String[] args) {
      int a =10;
/*
      Drawable circle = new Drawable(){
         public void draw(){System.out.println("drawable +"+a);}
      };
      circle.draw();
*/
//with lambda expression;
      Drawable rectangle = ()->{
         System.out.println("drawable:"+a);
      };
      rectangle.draw();
   }
}

interface Drawable{
void draw();
}
