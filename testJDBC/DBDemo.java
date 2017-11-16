package jdbcDataBase;
import java.nio.file.*;
import java.io.*;
public class DBDemo {
	public static void main(String[]args){
	      //converting a string to the byte array;
	      String s=new String(" SQL statements, create database, create tables.");
	      byte data[]=s.getBytes();
	      Path p=Paths.get("/Users/linfengwang/desktop/java/testcode/testJDBC/myFile.txt");
/*
	      try(OutputStream out=new BufferedOutputStream(Files.newOutputStream(p,CREATE,APPEND))){
	         out.write(data,0,data.length);
	      }catch(IOException e){
	          System.err.println(e);
	      }
	  */
	   }
}
