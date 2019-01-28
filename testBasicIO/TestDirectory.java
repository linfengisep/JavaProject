import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;

import static java.nio.file.FileVisitResult.*;

public class TestDirectory extends SimpleFileVisitor<Path>{
      @Override
      public FileVisitResult visitFile(Path file,BasicFileAttributes attr){
         Path target = Paths.get("/Users/linfengwang/Desktop/Java/JavaProject/testBasicIO/test/sample.txt");
         if (file.compareTo(target) == 0) {
            System.out.println("Located file: " + target);
            return TERMINATE;
         }
         return CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir,IOException exc) {
         System.out.format("Dir finished: %s%n", dir);
         return CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file,IOException exc) {
         System.out.println("failed: "+ file.getFileName());
         return CONTINUE;
      }

      public static void main(String[] args) throws IOException {
         TestDirectory dir = new TestDirectory();
         Path path = Paths.get("/Users/linfengwang/Desktop/Java/JavaProject/testBasicIO");
         Files.walkFileTree(path, dir);
      }
/*
   public static void main(String[] args) {
      //list all the contents of a directory: not its subdirectory;
      Path dirPath = Paths.get("/Users/linfengwang/Desktop/Java/JavaProject/testBasicIO/test");
      try(DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)){
         for(Path file:stream){
            System.out.println("file name:"+file.getFileName());
         }
      }catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
      }
   }
*/
}
