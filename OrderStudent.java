import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
public class OrderStudent {
   public static List<Student> order(List<Student> listStudents){
      Collections.sort(listStudents, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
      }
     }
   );
      return listStudents;
   }

   public static void main(String[] args) throws IOException{
      List<Student> lists = new ArrayList<>();
      Student student1 = new Student(8,"Laurent");
      Student student2 = new Student(1,"Thibaut");
      Student student3 = new Student(3,"François");
      Student student4 = new Student(0,"Lee");
      lists.add(student1);
      lists.add(student2);
      lists.add(student3);
      lists.add(student4);
      for(Student student:order(lists)){
         System.out.println(student.toString());
      }
   }

   class Student{
        public int age;
        public String name;
        public Student(int age,String name){
           this.age=age;
           this.name = name;
        }
        @Override
        public String toString(){
           return "Student:"+this.name+", age:"+this.age;
        }
     }
}
/*
using Collections.sort() with Comparator.java
defining the sorting order in compareTo();
not for immutable object;
*/
