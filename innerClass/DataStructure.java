public class DataStructure {
   private final static int SIZE = 15;
   private int[] arrayOfInts = new int[SIZE];

   public DataStructure() {
       for (int i = 0; i < SIZE; i++) {
           arrayOfInts[i] = i;
       }
   }
   public void printEven() {
       DataStructureIterator iterator = this.new EvenIterator();
       while (iterator.hasNext()) {
           System.out.print(iterator.next() + " ");
       }
       System.out.println();
   }
/*
   public void print(DataStructureIterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
   }
*/

/*
    public void print(DataStructureIterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
*/

/*
    public void print(java.util.function.Function<Integer, Boolean> iterator){
        for(Integer n:arrayOfInts){
             if(iterator.apply(n)){
                 System.out.println(n);
             }
        }
    }
*/
    public static boolean isEvenIndex(int m){
        return m%2==0;
    }

    public void print(java.util.function.Function<Integer, Boolean> iterator){
        for(Integer n:arrayOfInts){
             if(iterator.apply(n)){
                 System.out.println(n);
             }
        }
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EvenIterator implements DataStructureIterator {

       private int nextIndex = 0;

       public boolean hasNext() {
           return (nextIndex <= SIZE - 1);
       }

       public Integer next() {
           Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
           nextIndex += 2;
           return retValue;
       }
   }

   public static void main(String s[]) {
       DataStructure ds = new DataStructure();
        //******for question 1:inner class*******
        //ds.print(ds.new EvenIterator());

        //******for question 2:anonymous class*******

        /*
        ds.print(new DataStructureIterator(){
           private int nextIndex = 1;
           public boolean hasNext() {
               return (nextIndex <= SIZE - 1);
           }
           public Integer next() {
               Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);
               nextIndex += 2;
               return retValue;
           }
        });
        */

        //******for question 3:lambda expression*******
        /*
        ds.print((n)-> n%2==0);
        ds.print((n)-> n%2!=0);
        */

        //******for question 4:method reference*******
        ds.print(DataStructure::isEvenIndex);
   }
}
