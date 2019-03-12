import java.util.HashMap;
//map and map implementation class, when confrent with the same key, it will replace
//the old value. here is a example to show it.
public class TestMap{
   public static void main(String[] args) {
   HashMap mMay = new HashMap();
   Object obj1 = new Object();
   Object obj2 = obj1;
   Object obj3 = obj1;
   mMay.put(obj1,1);
   mMay.put(obj2,2);
   mMay.put(obj3,3);
   System.out.println(mMay.get(obj1));
   System.out.println(mMay.get(obj2));
   System.out.println(mMay.get(obj3));
   System.out.println("equals?:"+obj1.equals(obj1));
   }
}
