import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;
public class Java8MReferenceTester{
   public Student[] students;
   public void loadingDataToArray(){
      Student s1 = new Student(LocalDate.of(2004,10,02),Student.Sex.MALE,"lu@gmail.com","lu thibaut");
      Student s2 = new Student(LocalDate.of(2005,04,01),Student.Sex.FEMALE,"vectoria@gmail.com","vectoria Isabel");
      Student s3 = new Student(LocalDate.of(1999,03,05),Student.Sex.FEMALE,"marion@gmail.com","marion macron");
      students = {s1,s2,s3};
   }
   public static void main(String[] args) {
      List streets = new ArrayList();
      streets.add("rue sain germain");
      streets.add("rue hugo");
      streets.add("rue saint plucide");
      streets.forEach(System.out::println);
      //method already have a name;
      loadingDataToArray();
      /*
      Arrays.sort(students,new Comparator<Student>{
         public int compare(Student a,Student b)}{
            return a.getBirthday()-b.getBirthday();
         }
      });
      use a lambda expression instead of defining and
      then creating a new instance of a class that implements Comparator
      */
      Arrays.sort(students,(a,b)->Student.compareByAge(a,b));
      //Arrays.sort(students,Student::compareByAge);
      //test
      for(Student student:students){
         System.out.println(student.name);
      };

   }
}
