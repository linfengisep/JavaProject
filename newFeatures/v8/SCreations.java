import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.ArrayList;

class SCreations {
    //from Array/collections
    static Stream<String> fromCollections(){
        String[] str = new String[]{"nice","stream"};
        Stream<String> stream = Arrays.stream(str);
        return stream;
    }
    //from collections;
    static Stream<String> fromStream(){
        Stream<String> strStream = Stream.of("bonjour","stream","qui","nous","facilite","les dev");
        return strStream;
    }

    //from ArrayList;
    static Stream<String> fromArrayListStr(){
        List<String> list = new ArrayList<String>();
        list = Arrays.asList("bienvenu","dans","java 8 stream","Paris");
        return list.stream();
    }

    static LongStream fromArrayListLong(){
        return Arrays.stream(new long[]{10L,22L,32L,14L,25L,25L,12L,10L,22L,10L,10});
    }
}
