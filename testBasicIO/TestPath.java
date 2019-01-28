import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.net.URI;
public class TestPath{
   private static final String MY_PATH="/desktop/deskFolder/subFolder/report";
   public static void main(String[] args) {
      Path path1 = Paths.get("/desktop/test.txt");
      //System.out.format("%s %n",path1.toString());
      Path path2 = FileSystems.getDefault().getPath("/desktop/test.txt");
      Path path3 = Paths.get(URI.create("file:///linfengwang/desktop/FileTest.java"));
      Path pathFolder = FileSystems.getDefault().getPath("/desktop/testFolder");
      // test Path methods, same result with file and folder.
      System.out.format("%s %n",path1.toString());
      System.out.format("%s %n",path1.getFileName());
      System.out.format("Path.getName(%d):%s %n",0,path1.getName(0));
      System.out.format("getParent:%s %n",path1.getParent());
      System.out.format("getRoot:%s %n",path1.getRoot());
      System.out.format("getFolderName:%s %n",pathFolder.getFileName());

      //join two path
      Path pathJoined = Paths.get("/desktop/testFolder");
      System.out.format("resolve path:%s %n",pathJoined.resolve("test.md"));

      //creating path between two path
      Path p1 = Paths.get("desktop/test/sub/repo");
      Path p2 = Paths.get("desktop/anotherTest.txt");
      System.out.format("relativize path:%s %n",p2.relativize(p1));

      //test Iterable of Path;
      Path pathIte = Paths.get(MY_PATH);
      for(Path name:pathIte){System.out.println(name);}

      //compare two Path;
      Path path5 = Paths.get(MY_PATH);
      Path path4 = Paths.get(MY_PATH);
      System.out.println(path5.equals(path4));
   }
}
