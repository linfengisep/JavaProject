import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.time.LocalDate;
import java.util.function.*; //for Supplier;

class Java8 {

    public static void main(String[] args){
        streamDemo();
        referenceDemo();
        optinalDemo();
        List<String> list = Arrays.asList("nice","feature");
        list.forEach(System.out::println);
    }

    /******** Utils **********/
    static void separator(){
        System.out.println("--------------------");
    }
    static void display(String title, String result){
        Java8.separator();
        System.out.println(String.format("** %1$s **",title));
        System.out.println(String.format("result-> %1$s",result));
    }
    /******** streams **********/
    static void streamDemo(){
        //apply the distinct() count() operations;
        long res = SOperations.distinctCount(SCreations.fromArrayListLong());
        Java8.display("distinct(), count()",res+"");

        //reduction
        long res1 = SOperations.reduction(SCreations.fromArrayListLong());
        Java8.display("reduce(), start with 0",res1+"");

        //mapping
        String res2 = SOperations.mapping(SCreations.fromStream()).collect(Collectors.toList()).toString();
        Java8.display("map()",res2);

        //matcher;
        String res3 = SOperations.matcher("paris");
        Java8.display("stream matcher()",res3);

        //collect();
        String res4 = SOperations.collectString(SCreations.fromArrayListStr());
        Java8.display("collect()",res4);
    }

    /******** references **********/
    static void referenceDemo(){
        Supplier<Stream<String>> streamSupplier = ()-> Stream.of("Macron","Holland","Sarkozy","Mitterrand","Napoleon","");
        //class static ref;
        boolean res = streamSupplier.get().anyMatch(Governor::isFamousName);
        Java8.display("class static method ref, include famous name? ",res+"");

        //instance method;
        Governor governor = new Governor(LocalDate.of(2020, 1, 8),Governor.Sex.MALE,"Chirac");
        boolean res1 = streamSupplier.get().anyMatch(governor::isChirac);
        Java8.display("instance method ref, include Chirac? ",res1+"");

        //java provided class;
        boolean res2 = streamSupplier.get().anyMatch(String::isEmpty);
        Java8.display("provided empty string?",res2+"");

        //class constructor;
    }

    static void optinalDemo(){
        Java8.display("Optional",Optional8.testOptional());
    }
}
