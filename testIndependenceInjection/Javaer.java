public class Javaer implements Coder {
    private String name;
    public Javaer(String name){
        this.name=name;
    }
    public void writeCode(){
        System.out.println(this.name + " is writing java code");
    }
}
