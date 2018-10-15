public class BlockTest{
   public static void main(String[] args) {
      MessageChanel chanel = new MessageChanel();
      (new Thread(new MessageReader(chanel))).start();
      (new Thread(new MessageWriter(chanel))).start();
   }
}
