import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
public class FileManager{
   static Function<String,List<DataPair<String,Integer>>> mapper = new Mapper();
   static BiFunction<Integer,Integer,Integer> reducer = new Reducer();
/*
   public static void writeFile(String fileNameWithFormat, String line){
      String parentFilePath = "/Users/linfengwang/desktop/";
      String filePath = String.format("%s%s",parentFilePath,fileNameWithFormat);
      File myFile = new File(filePath);
      Charset charset = Charset.forName("UTF-8");
      BufferedWriter bf = null;
      try{
         bf = new BufferedWriter(new FileWriter(myFile));
         bf.write(line,0,line.length());
      }catch(IOException e){
         System.err.format("IOException:%s%n",e);
      }finally{
         if(bf !=null){
            try{
               bf.close();
            }catch(IOException e){}
         }
      }
   }
*/
   public static void readFile(String filePath,List<String> data){
      Charset charset = Charset.forName("UTF-8");
      Path myPath = Paths.get(filePath);
      try{
         BufferedReader reader = Files.newBufferedReader(myPath, charset);
         String line = null;
         while ((line = reader.readLine()) != null) {
            data.add(line);
         }
      } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
      }
   }
   /*
   1.List implements Collections
   Collections.parallelStream():Returns a possibly parallel Stream with this collection as its source
   Collections.stream():Returns a sequential Stream with this collection as its source
   so all the implementation of list can use the parallelStream().

   2.Stream:A sequence of elements supporting sequential and parallel aggregate operations
   Stream.flatMap():Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream
   produced by applying the provided mapping function to each element

   Stream.collect():Performs a mutable reduction operation on the elements of this stream using a Collector
   */
   public static <K,V,U> List<DataPair<K,V>> map(Function<U,List<DataPair<K,V>>> f, List<U> input){
      return input.parallelStream()
         .flatMap(e -> f.apply(e).stream())
         .collect(Collectors.toList());
   }

   public static void main(String[] args) {
      String myFilePath = "/Users/linfengwang/desktop/test.txt";

      List<DataPair<String,Integer>> result = new ArrayList<>();
      List<String> fileData = new ArrayList<>();
      readFile(myFilePath,fileData);
      //for(String s:fileData){System.out.println(s);}
      List<DataPair<String,Integer>> r = map(mapper,fileData);
      for(DataPair d:r){
         System.out.println("key:"+d.key+",and value:"+d.value);
      }


   }
}
