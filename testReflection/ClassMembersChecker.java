import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

enum ClassMember { METHOD,FIELD,CONSTRUCTOR,CLASS };

public class ClassMembersChecker{
   public static void main(String[] args) {
      try{
         Class c = Class.forName(args[0]);
         System.out.println("args:"+c.getCanonicalName());
         System.out.format("*********package name**************");
         Package p = c.getPackage();
         System.out.format("%n %s %n",(p!=null? p.getName():"no package"));
         System.out.format("*********Member**************");
         for(int i=1;i<args.length;i++){
            switch(ClassMember.valueOf(args[i])){
               case METHOD: getMembers(c.getMethods(),"Method"); break;
               case FIELD:getMembers(c.getFields(),"FIELD"); break;
               case CONSTRUCTOR:getMembers(c.getConstructors(),"CONSTRUCTOR");break;
               case CLASS:getTheirClasses(c);break;
               default: assert false;
            }
         }
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
   }
   private static void getMembers(Member[] members,String s){
      System.out.format("%n %s",s);
      for(Member member:members){
         if(member instanceof Field){
            System.out.format("%n %s %n",((Field)member).toGenericString());
         }else if(member instanceof Method){
            System.out.format("%n %s %n",((Method)member).toGenericString());
         }else if(member instanceof Constructor){
            System.out.format("%n %s %n",((Constructor)member).toGenericString());
         }
      }
      if(members.length==0)
         System.out.format("*********0 member**********");
   }

   private static void getTheirClasses(Class<?> myClass){
      Class<?>[] arrClass = myClass.getClasses();
      for(Class<?> c : arrClass){System.out.format("class name:%s %n",c.getCanonicalName());}
      System.out.format("%s %n",(arrClass.length == 0 ? "no class":""));
   }
}
