import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LoadFile{
   public static String path="/Users/linfengwang/Desktop/Java/JavaProject/testLoadFile/datafile.txt";
   public static List<String> data=new ArrayList<String>();

   public static void loading(String path){
      try {
         data=Files.readAllLines((new File(path)).toPath());
         for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
         }
          //List<String> lines  = Files.readAllLines(new File(path).toPath());
          //data.addAll(lines);
          } catch (Exception e) {
         System.err.println("Things went wrong: " + e.getMessage());
         e.printStackTrace();
      }
   }

   public static void main(String[]args){
      loading(path);
   }
}
