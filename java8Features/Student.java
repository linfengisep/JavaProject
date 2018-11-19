import java.time.LocalDate;
public class Student{
       String name;
       LocalDate birthday;
       Sex gender;
      public Student(LocalDate birthday,Sex sex,String name){
         this.name = name;
         this.birthday = birthday;
         this.gender = gender;
      }

       public LocalDate getBirthday() {
           return birthday;
       }

       public static int compareByAge(Student a, Student b) {
           return a.birthday.compareTo(b.birthday);
       }

       public enum Sex {
          MALE,
          FEMALE
       }
}
