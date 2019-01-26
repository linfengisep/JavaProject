import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByteTest{
   public static void main(String[] args) throws IOException {
      FileInputStream input = null;
      FileOutputStream output = null;
      try{
         //FileInputStream(String name):Creates a FileInputStream by opening a connection to an actual file
         input = new FileInputStream("test.txt");
         output = new FileOutputStream("out.txt");
         int character;
         //FileInputStream.read(): -1 if there is no more data because the end of the file has been reached
         while((character = input.read()) != -1){
            output.write(character);
         }
      }finally{
         if(input !=null){
            input.close();
         }
         if(output !=null){
            output.close();
         }
      }
   }
}
