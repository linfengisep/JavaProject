import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestBufferdStream{
   public static void main(String[] args) throws IOException {
      BufferedReader reader = null;
      BufferedWriter writer = null;
      try{
         reader = new BufferedReader(new FileReader("test.txt"));
         writer = new BufferedWriter(new FileWriter("buffered_output.txt"));
         String s;
         while((s = reader.readLine())!=null){
            writer.write(s);
            writer.newLine();
         }
      }finally{
         if(reader !=null) reader.close();
         if(writer !=null) writer.close();
      }
   }
}
