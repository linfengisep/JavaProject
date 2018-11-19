public class TestNameParser{
   public static void main(String[] args) {
      Name name = NameParser.parse("lin wang",new Creator<Name>(){
         @Override
         public Name create(String fristName, String lastName){
               return new Name(fristName,lastName);
         }
      });
   }
}
