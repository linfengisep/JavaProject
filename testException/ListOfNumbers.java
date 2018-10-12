/*
finally block will for sure execute.
catch or not depends on the type of the exception.
bigger exception is lower.
*/
import java.util.*;
import java.io.*;
public class ListOfNumbers{
   private List<Integer> list;
   private static final int SIZE = 10;
   private Vector<Integer> victor = new Vector<Integer>(SIZE);

   public ListOfNumbers(){
      list = new ArrayList<Integer>(SIZE);
      for (int i=0;i < SIZE; i++) {
         list.add(new Integer(i));
      }
   }

   public void writeList(){
         PrintWriter pWriter = null;
      try{
         pWriter = new PrintWriter(new FileWriter("OutFile.md"));
         for (int i=5;i<SIZE ;i++) {
            pWriter.println(list.get(i));
            System.out.println("element:"+list.get(i));
         }
      }catch(IOException e){
         System.out.println("IO exception:"+e);
      }catch(IndexOutOfBoundsException e){
         System.out.println("index out of bounds exception:"+e);
      }finally{// key block for preventing resource leaks. pWriter.close();
         if(pWriter !=null){
            System.out.println("closing printWriter not null");
            pWriter.close();
         }else{
            System.out.println("printWriter null");
         }
      }
   }
   /*Exercise Exception
   *read int values in file, print them, append them to a vector;
   */

   public void readList(String filaName){
      String line = null;
      try{
         RandomAccessFile raf = new RandomAccessFile(filaName ,"r");
         while ((line = raf.readLine()) !=null){
            Integer i = new Integer(Integer.parseInt(line));
            victor.addElement(i);
         }
      } catch (FileNotFoundException e){
         System.out.println("io exception"+e);
      } catch (IOException e){
         System.out.println("io exception"+e);
      }
   }

   public static void main(String[] args) {
   ListOfNumbers ls=   new ListOfNumbers();
   ls.writeList();
   ls.readList("InputFile.md");
   }
}
