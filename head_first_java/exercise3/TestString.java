import java.util.Date;
public class TestString{
   public static void main(String[]args){
   //format a number with comma;
   String test = String.format("%c",42);
   System.out.println(test);
   System.out.println(String.format("%tc",new Date()));
   System.out.println(String.format("%tA,%tB %td",new Date(),new Date(),new Date()));

}
}
