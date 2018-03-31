import java.io.*;
import static java.lang.System.out;

public class GameSaveTest{
   public static void main(String[]args){
      GameCharacter elf = new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"});
      GameCharacter troll = new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"});
      GameCharacter magician = new GameCharacter(120,"Magician",new String[]{"spells","invisibility"});
      try{
         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
         os.writeObject(elf);
         os.writeObject(troll);
         os.writeObject(magician);
         os.close();
      }catch(IOException ex){ex.printStackTrace();}
         //we set them to null so we can't access the objects on the heap;
         elf =null;
         troll =null;
         magician =null;
      //read them back in from the file;

      try{
         ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
         GameCharacter oneRestore = (GameCharacter) is.readObject();
         GameCharacter twoRestore = (GameCharacter) is.readObject();
         GameCharacter threeRestore = (GameCharacter) is.readObject();

         out.println("one's type:"+oneRestore.getType());
         out.println("two's type:"+twoRestore.getType());
         out.println("three's type:"+threeRestore.getType());
      }catch(Exception ex){ ex.printStackTrace();}












   }
}
