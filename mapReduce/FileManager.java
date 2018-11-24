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
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
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
   /*
   Map.getOrDefault:Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
   */

   public static <K,V> Map<K,List<V>> shuffle (List<DataPair<K,V>> list){
      Map<K,List<V>> map = new HashMap<>();
      for(DataPair<K,V> d : list){
         List<V> l = new ArrayList<>();
         l = map.getOrDefault(d.key,new ArrayList<>());
         l.add(d.value);
         map.put(d.key,l);
      }
      return map;
   }
/*
Stream.map():Returns a stream consisting of the results of applying the given function to the elements of this stream.
*/
   public static <K,V> List<DataPair<K,V>> reduce(BiFunction<V,V,V> bf, V begin, Map<K,List<V>> data){
      return data.entrySet().parallelStream()
            .map(e->{
                V res = begin;
                for(V i : e.getValue()){
                  res = bf.apply(i,res);
                }
               return new DataPair<>(e.getKey(),res);
               }).collect(Collectors.toList());
   }
   public static void printMap(Map map){
      Iterator it = map.entrySet().iterator();
      while(it.hasNext()){
         Map.Entry pair = (Map.Entry) it.next();
         System.out.println(pair.getKey() + " = " + pair.getValue());
         it.remove();
      }
   }
   public static void main(String[] args) {
      String myFilePath = "/Users/linfengwang/desktop/test.txt";

      List<DataPair<String,Integer>> result = new ArrayList<>();
      List<String> fileData = new ArrayList<>();
      readFile(myFilePath,fileData);
      List<DataPair<String,Integer>> listDataPair = map(mapper,fileData);
      //printMap(shuffle(listDataPair));
      Map<String,List<Integer>> shuffed = shuffle(listDataPair);
      for(DataPair<String,Integer> d:reduce(reducer,0,shuffed)){
         System.out.println("key:"+d.key+",value:"+d.value);
      }
   }
}
