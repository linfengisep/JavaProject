public class Dog extends Animal{

   public int weight=0;
   public String color = null;

   public Dog(int weight){
      this(weight,"grey");//call the second constructor,with default color grey;
   }

   public Dog(int weight,String color){
      this(weight,color,10);//call the third constructor,with default speed 10
   }

   public Dog(int weight,String color,int speed){
      super(weight,color,speed);
      init(weight);
   }

   public void init(int initWeight){
      System.out.println("init weight is:="+initWeight);
   }

   public void basicSkill(){
      System.out.println("Moving");
   }

   public static void main(String[]args){
   Dog taddi= new Dog(30);
   taddi.basicSkill();
   }
}
