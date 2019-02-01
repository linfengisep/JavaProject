import java.nio.file.PathMatcher;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchFile{
   public static void main(String[] args) {
      PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.{java,class}");
      Path path = FileSystems.getDefault().getPath("/Users/linfengwang/Desktop/Java/JavaProject/testBasicIO");
      if(pm.matches(path)){
         System.out.println(path.getFileName());
      }else{
         System.out.println("not found:"+path.toString());
      }
   }
}
