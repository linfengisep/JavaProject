public class Student{
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
