import java.lang.Class;
import java.lang.Annotation;

import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;

import java.util.List;
import java.util.ArrayList;

public class ClassDeclarationChecker{
   public static void main(String[] args) {
      if(args.length !=0){
         try{
            Class c = Class.forName(args[0]);
            System.out.format("CanonicalName:%n %s %n",c.getCanonicalName());
            System.out.println("**********Modifier name:**********");
            System.out.format("Modifiers:%s %n",Modifier.toString(c.getModifiers()));
            System.out.println("**********Type variables:**********");
            TypeVariable[] tv = c.getTypeParameters();
            if(tv.length !=0){
                  for(TypeVariable e:tv){
                     System.out.format("TypeVariable:%s %n",e.getName());
                  }
            }
            System.out.println("**********Generic interfaces:**********");
            Type[] types = c.getGenericInterfaces();
            for(Type t:types){
               System.out.println(t.getTypeName());
            }
            System.out.println("**********Parent Class:**********");
            List<Class> parentClassList = new ArrayList<>();
            getAncestor(c,parentClassList);
            if(parentClassList.size()!=0){
               for(Class<?> cInstance:parentClassList){
                  System.out.println("super class name:"+cInstance.getCanonicalName());
               }
            }else{
                  System.out.println("no super class path");
            }
            System.out.println("**********Annotation:**********");
            /*
            Annotation[] annotations = c.getAnnotations();
            if(annotations.length !=0){
               for(Annotation a : annotations){System.out.format("%n it has annotation:%s %n",a.toString());}
            }else{
               System.out.format("no annotations");
            }
            */
         }catch(ClassNotFoundException e){
            System.out.println(e);
         }
      }
   }

   private static void getAncestor(Class<?> c,List<Class> parentClassList){
         Class<?> classInstance = c.getSuperclass();
         if(classInstance !=null){
            parentClassList.add(classInstance);
            getAncestor(classInstance,parentClassList);
         }
   }
}
