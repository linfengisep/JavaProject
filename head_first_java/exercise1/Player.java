
public class Player{
   int number;
   String name;
   public Player(String name){
      this.name = name;
   }
   public int guess(){
   System.out.println("Which number you are guessing?");
      int guessNbr=UtilRandomNumber.ramdInt(1,10);
      number = guessNbr;
   return guessNbr;
   }

   public String getName(){
         return this.name;
      }
}
