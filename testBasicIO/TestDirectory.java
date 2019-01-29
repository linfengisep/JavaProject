import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileSystems;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;

import static java.nio.file.FileVisitResult.*;

public class TestDirectory {
      public static class Searcher extends SimpleFileVisitor<Path>{
         private PathMatcher pMatcher;
         private int numMatched;

         //constructor
         Searcher(String search_pattern){
            pMatcher = FileSystems.getDefault().getPathMatcher("glob:"+search_pattern);
         }

         private void search(Path path){
            Path fileOrDirname = path.getFileName();
            if(pMatcher !=null && pMatcher.matches(fileOrDirname)){
               System.out.format("%s%n",path.getFileName());
               numMatched++;
            }
         }

         private void searchEnd(){
            System.out.format("Matched %d times %n",this.numMatched);
         }

         //Invoked for a file in a dir
         @Override
         public FileVisitResult visitFile(Path file,BasicFileAttributes attr){
            search(file);
            return CONTINUE;
         }

         //Invoked for a directory before entries in the directory are visited
         @Override
         public FileVisitResult postVisitDirectory(Path dir,IOException exc) {
            search(dir);
            return CONTINUE;
         }

         //Invoked for a file that could not be visited.
         @Override
         public FileVisitResult visitFileFailed(Path file,IOException exc) {
            System.out.println("failed: "+ file.getFileName());
            return CONTINUE;
         }
      }
   /*
   **in terminal, enter two arguments,
   **first argument: directory where you want to execute your search.
   **second argument: glob pattern/reguler expression you want to use.
   */
   public static void main(String[] args) throws IOException {
      //Terminates the currently running Java Virtual Machine if argument < 2;
      if(args.length < 2) {
         System.out.format("Please enter two argument: first:directory, second:search pattern%nExample: java TestDirectory . \"*.java\"%n .: current dir %n");
         System.exit(-1);
      }
      String pattern = args[1];
      Path dirPath = Paths.get(args[0]);
      Searcher searcher = new Searcher(pattern);
      Files.walkFileTree(dirPath, searcher);
      searcher.searchEnd();
   }
}
