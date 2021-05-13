import java.util.stream.*;
import java.util.List;
import java.util.function.*;

class SOperations{
    //distinct(), count();
    static long distinctCount(LongStream stream){
        return stream.distinct().count();
    }

    //anyMatch(), AllMatch(); nonMatch();
    static String matcher(String str){
        Supplier<Stream<String>> streamSupplier = ()-> Stream.of("bienvenu","dans","java 8 stream","Paris");
        boolean anyMatchRes = streamSupplier.get().anyMatch(e-> e.contains(str));
        boolean allMatchRes = streamSupplier.get().allMatch(e-> e.contains(str));
        boolean noneMatchRes = streamSupplier.get().noneMatch(e-> e.contains(str));
        return "for matching " + str
                + ": anyMatch " + anyMatchRes
                + ", allMatch " + allMatchRes
                + " noneMatch " + noneMatchRes;
    }
    //filter;
    static int filter(Stream<String> stream, String str){
        return stream.filter(e-> e.contains("paris")).toArray().length;
    }

    //mapping;
    static Stream<String> mapping(Stream<String> stream){
        return stream.map(e-> "**"+e+"**");
    }

    //reduction;
    static long reduction(LongStream stream){
        return stream.reduce(0,(a,b)-> a+b);
    }

    //collection;
    static String collectString(Stream<String> stream){
        return stream.map(e-> e.toUpperCase()).collect(Collectors.toList()).toString();
    }
}
