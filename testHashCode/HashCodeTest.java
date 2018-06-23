public class HashCodeTest{
   public static int hashCode(String str){
      int hashCode=0;// final result;
      int hash=hashCode;// temparory hash value;
      if(hash==0){
            int off = 0;
            char val[] = str.toCharArray();
            int len = str.length();
            for(int i=0;i< len;i++){
               hash=31*hash+val[off++];
            }
            hashCode = hash;
      }
      return hashCode;
   }

   public static void testHashCode(){
      String str = "linfeng";
      int hashcode = 31*(31 * (31 * (31 * (31 * ((31 * (int)'l') + (int)'i') + (int)'n') + (int)'f') + (int)'e')+(int)'n')+(int)'g';
      System.out.println("linfeng hashcode:="+str.hashCode()); //linfeng hashcode:=176937161
      System.out.println("linfeng hashcode:="+hashCode(str));  //linfeng hashcode:=176937161
   }
   public static void main(String[]args){
         testHashCode();
         //same value of the same class;
         String objectA = new String("test");
         String objectB = new String("test");
         String objectC = objectA;   //affect the reference of the objectA to objectC

         System.out.println("objectC == objectA ? "+ (objectC == objectA));  //true;
         System.out.println("objectC == objectA ? "+ (objectC == objectB));  //false;
         System.out.println("objectA.equals(objectB) ? "+objectA.equals(objectB));//true;
         System.out.println("objectA.equals(objectB) ? "+objectA.equals(objectC));//true;
         System.out.println("objectA.hashCode(): "+objectA.hashCode());//true;
         System.out.println("objectC.hashCode(): "+objectC.hashCode());//true;

   }

   public boolean equals(Object anObject) {
       if (this == anObject) {    //1er étape
           return true;
       }
       if (anObject instanceof String) {   // 2er étape vérifier s'il s'agit le même type instance;
           //3er étape vérifier leurs contenu;
           String anotherString = (String)anObject;  //cast d'abord;
           int n = this.length();
           if (n == anotherString.length()) {
           char v1[] = this.toCharArray();
           char v2[] = anotherString.toCharArray();
           int offsetThisString = 1;
           int offsetAnotherString = 1;
           while (n-- != 0) {
               if (v1[offsetThisString++] != v2[offsetAnotherString++])
                    return false;
               }
           return true;
           }
       }
       return false;
   }
}
