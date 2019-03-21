import java.time.LocalDate;
import java.util.*;
public class Student{
    protected String name;
    protected String email;
    protected LocalDate birthday;
    protected int nStudent;

    public Student (String name,String email,LocalDate date,int number) {
        this.name = name;
        this.email = email;
        this.birthday = date;
        this.nStudent = number;
    }

    public static int comparedByAge(Student s1,Student s2){
        return s1.birthday.compareTo(s2.birthday);
    }
    public int comparedByName(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
    public static void display(Student[] studentArr){
        for(Student s:studentArr){
            System.out.println(s.name);
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Snow",
                    "john@snow.com",LocalDate.now(),3294);
        Student student2 = new Student("Matthieu",
                    "mathieu@gmail.com",LocalDate.of(2018,3,4),3345);
        Student student3 = new Student("François",
                    "fFalconnet@gmail.com",LocalDate.of(2017,3,4),3301);
        Student[] studentArr = {student2,student3,student1};
        //solution 1: anonymous class
        // Arrays.sort(studentArr,new Comparator<Student>(){
        //     public int compare(Student std1,Student std2){
        //         return std1.birthday.compareTo(std2.birthday);
        //     }
        // });

        //solution 2: lambda expression.
        // Arrays.sort(studentArr,(std1,std2)->{
        //     return std1.birthday.compareTo(std2.birthday);
        // });

        //solution 3: lambda expression invoking an exsiting methods;
        // Arrays.sort(studentArr,(a, b) -> Student.comparedByAge(a, b));

        //solution 4: method reference;
        //Arrays.sort(studentArr,Student::comparedByAge);

        Arrays.sort(studentArr,student1::comparedByName);
        display(studentArr);
    }
}
