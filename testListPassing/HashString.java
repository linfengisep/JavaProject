import java.util.*;
import java.security.MessageDigest;

public class HashString{

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

   public static void main(String[]args){
      String s="syrine";
      HashString hs=new HashString();
      System.out.println("hash of my name is:"+hs.getHashString(s));
   }

}
