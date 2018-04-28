public class MyFramework{
   public static void main(String[]args){
      Task task = new Task("Project app");
      //step2;
      //Javaer programmer = new Javaer("François");

      //step3, change the dependence type dynamically;
      Coder coder = new Pythoner("Thomas");

      task.setProgrammer(coder);

      task.start();
   }
}
