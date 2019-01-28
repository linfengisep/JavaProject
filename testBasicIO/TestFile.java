import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystems;
import java.nio.file.StandardCopyOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import static java.nio.file.StandardOpenOption.*;

public class TestFile{
   public static void main(String[] args) throws IOException{
      Path path = FileSystems.getDefault().getPath("test.txt");
      System.out.println(path.toString());
      boolean isFileOk = Files.isRegularFile(path) & Files.isReadable(path) & Files.isWritable(path);
      System.out.println(isFileOk);
      //move file
      Path path1 = Paths.get("/Users/linfengwang/desktop/testFolder/fo/sample.txt");
      Path path2 = Paths.get("/Users/linfengwang/desktop/testFolder");
      //Files.move(path1,path2,StandardCopyOption.REPLACE_EXISTING);

      // checking exsitence of file: how to distingush the file and folder?
      // A:with extension, file, without, it is a folder.
      System.out.println(Files.exists(path2));

      //try to delete a file
      try{
         Files.deleteIfExists(path2);
         //Files.delete(path2);
      }catch(NoSuchFileException e){
         System.err.format("No such %s exception %n",path2.toString());
      }catch(DirectoryNotEmptyException e){
         System.err.format("Folder: %s not empty, failed %n",path2.toString());
      }catch(IOException e){
         System.err.format(e.getMessage());
      }

      //metadata
      BasicFileAttributes basicAttributes = Files.readAttributes(path2,BasicFileAttributes.class);
      System.out.format("creationTime:%s %n",basicAttributes.creationTime());
      System.out.format("Is a directory?:%s %n",basicAttributes.isDirectory());
      System.out.format("Last modified time:%s %n",basicAttributes.lastModifiedTime());

      //write data to file: must instantiate BufferedOutputStream in try(instantiate here){}
      String s = "writing test";
      byte[] mData = s.getBytes();
      //System.out.println("data.length:"+mData.length);
      Path myfilePath = Paths.get("./data.txt");
      //OutputStream out = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE, APPEND));
      try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(myfilePath, CREATE, APPEND)))
      {
         //System.out.println(out.toString());
         out.write(mData,0,mData.length);
      }catch(IOException e){}
   }
}
