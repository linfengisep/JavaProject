import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileManager{

   public static void writeFile(String fileNameWithFormat, String line){
      String parentFilePath = "/Users/linfengwang/desktop/";
      String filePath = String.format("%s%s",parentFilePath,fileNameWithFormat);
      File myFile = new File(filePath);
      Charset charset = Charset.forName("UTF-8");
      BufferedWriter bf = null;
      try{
         bf = new BufferedWriter(new FileWriter(myFile));
         bf.write(line,0,line.length());
      }catch(IOException e){
         System.err.format("IOException:%s%n",e);
      }finally{
         if(bf !=null){
            try{
               bf.close();
            }catch(IOException e){}
         }
      }
   }

   public static void readFile(String filePath){
      Charset charset = Charset.forName("UTF-8");
      Path myPath = Paths.get(filePath);
      try{
         BufferedReader reader = Files.newBufferedReader(myPath, charset);
         String line = null;
         while ((line = reader.readLine()) != null) {
            //writeFile("goog.txt",line);
         }
      } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
      }
   }


   public static void main(String[] args) {
      String myFilePath = "/Users/linfengwang/desktop/dagger.txt";
      //writeFile("filegood.txt");
      readFile(myFilePath);
   }
}
