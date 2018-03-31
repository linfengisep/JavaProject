import java.io.*;
public class ReadAFile{
   public static void main(String[]args){
      try{
         File myFile = new File("/Users/desktop/Java/JavaProject/head_first_java/exercise4/Game.ser");
         FileReader fileReader = new FileReader(myFile);
         BufferedReader reader = new BufferedReader(fileReader);
         String line =null;
         while((line = reader.readLine()) !=null){
            System.out.println(line);
         }
      }catch(Exception ex){
         ex.printStackTrace();
      }
   }
}
