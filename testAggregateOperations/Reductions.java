import java.util.*;
import java.util.stream.Collectors;


public class Reductions{
    public static void main(String[] args) {
        List<Student> students = Student.createStudentsArr();
        //aggregate operation forEach();
        students.stream().forEach(e-> System.out.println(e.getName()));
        //aggregate operation:average age
        double result = students.stream()
                            .filter(s-> s.getGender() == Student.Sex.MALE)
                            .mapToInt(Student::getAge)
                            .peek(e->System.out.println("mapToInt:"+e))
                            .average()//terminal operation
                            //.peek(e->System.out.println("average value:"+e))
                            .getAsDouble();
        System.out.println(result);
        //aggregate operation:sum of their ages;
        System.out.println(
                students.stream()
                .mapToInt(Student::getAge)
                .sum()
            );
        System.out.println(
                students.stream()
                .mapToInt(Student::getAge)
                .reduce(0,(a,b)-> a+b)
            );
        //aggregate operation:male name collections
        System.out.println(
            students.stream()
                    .filter( e-> e.getGender() == Student.Sex.MALE)
                    .collect(Collectors.toList())
                    //.size()
            );

        //aggregate operation:group by gender
        students.stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }
}
