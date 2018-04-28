public class Task{
   private String name;
       private Coder coder;
       public Task(String name){
           this.name =name;
       }
       //step2:
       public void setProgrammer(Coder programmer){
            this.coder = programmer;
       }

       public void start(){
            System.out.println(this.name+ " started");
            this.coder.writeCode();
       }
}
