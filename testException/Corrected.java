import java.io.*;
import java.util.Vector;

public class Corrected {
      public static void cat(File file) {
         RandomAccessFile input = null;
         String line = null;
         try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
               System.out.println(line);
             }
         } catch(FileNotFoundException e){
                  System.out.println("dss"+e);
            }catch(IOException e){
                  System.out.println("io"+e);
            }
         }
    public static void main(String[] args) {
      cat(new File("InputFile.md"));
    }
}
