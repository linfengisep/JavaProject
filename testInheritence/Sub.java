public class Sub extends Super{
    public Sub(String s){
        //super(s);//constuctor in the super can't applied to the given type;
        System.out.println("in Sub class"+s);
    }
    public static void main(String[] args) {
        Sub sub = new Sub("ok");
    }
}
