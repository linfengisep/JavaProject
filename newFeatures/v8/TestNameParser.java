public class TestNameParser{
   public static void main(String[] args) {
      NameParser nameParser = new NameParser();
      Name name = nameParser.parse("lin wang",new Creator<Name>(){
         @Override
         public Name create(String fristName, String lastName){
               return new Name(fristName,lastName);
         }
      });
      //Name name = NameParser.parse("lin wang",(firstName,lastName)-> new Name(firstName,lastName));
      //Name name = NameParser.parse("lin wang",Name::new);
   }
}
