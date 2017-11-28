import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.*;
import java.security.MessageDigest;


public class TestInputFile{

   public String path=null;
   public List<String> list=new ArrayList<String>();

   public void importFile(String path){
   File file=new File(path);
   FileInputStream fis=null;
   BufferedInputStream fileBS=null;
   DataInputStream dis=null;

   try{
      fis=new FileInputStream(file);
      fileBS=new BufferedInputStream(fis);
      dis=new DataInputStream(fileBS);
         while(dis.available() !=0){
              //System.out.println("we r here:"+dis.readLine());
               list.add(dis.readLine());
         }
         fis.close();
         fileBS.close();
         dis.close();
      }catch(FileNotFoundException e){
      e.printStackTrace();
      }catch(IOException e){
      e.printStackTrace();
      }
   }


      public String getHashString(String str){
         byte[] byteTree;
         try{
             MessageDigest md = MessageDigest.getInstance("SHA-256");
             md.update(str.getBytes());
             byteTree = md.digest();/*
             System.out.println("the byteTree[] length is:"+byteTree.length);
             for(byte b:byteTree){
               System.out.println("byte is:"+b);
             }
      */
             StringBuilder sb = new StringBuilder(2 * byteTree.length);
             for(byte b: byteTree) {
               sb.append(String.format("%02x", b&0xff) );
             }
             return sb.toString();
         } catch (Exception e) {
                 e.printStackTrace();
         }
         return "";
      }

      public void showBufferContent(List<String> list){
      for(int i=0;i<list.size();i++)
            System.out.println("Voilà les hashs des écoles:"+list.get(i).toString()+": "+getHashString(list.get(i)));
      }

   public static void main(String[]args){
    TestInputFile test=new TestInputFile();
    String s="/Users/linfengwang/Desktop/Java/JavaProject/testInputFile/data.txt";
    test.importFile(s);
    test.showBufferContent(test.list);
   }
}
