import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Parallelism{
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5,6,7,8};
        List<Integer> intList = new ArrayList<>(Arrays.asList(intArr));
        intList.parallelStream()
               .forEach(e-> System.out.println(e));
    }
}
