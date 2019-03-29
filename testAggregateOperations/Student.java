import java.time.LocalDate;
import java.util.*;

public class Student{
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String email;
    public Student(String name,LocalDate birthday,Sex gender,String email){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) -
                birthday.getYear();
    }

    public Sex getGender(){return this.gender;}

    public String getName() {
        return this.name;
    }

    public static List<Student> createStudentsArr(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Lee",LocalDate.of(2000,12,16),Sex.MALE,"lee@gmail.com"));
        students.add(new Student("Thibaut",LocalDate.of(1993,2,4),Sex.MALE,"thibaut@gmail.com"));
        students.add(new Student("Alexis",LocalDate.of(1997,6,20),Sex.MALE,"alexis@gmail.com"));
        students.add(new Student("François",LocalDate.of(1995,6,10),Sex.FEMALE,"francois@gmail.com"));
        return students;
    }
}
