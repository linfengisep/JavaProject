import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class Java8 {

    static void separator(){
        System.out.println("--------------------");
    }
    static void display(String title, String result){
        Java8.separator();
        System.out.println(String.format("** %1$s **",title));
        System.out.println(String.format("result-> %1$s",result));
    }

    public static void main(String[] args){
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
}
