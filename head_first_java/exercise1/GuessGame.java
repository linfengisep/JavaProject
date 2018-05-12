import java.util.*;
public class GuessGame{
   List<Player> playerList = new ArrayList<>();
   int randomNumber;
   int guessNumber;
   boolean flag = true;
   public void startGame(){
      int noInitilizedValue;
      //set the nubmer;
      randomNumber = UtilRandomNumber.ramdInt(1,9);
      //System.out.println("target nubmer is :"+randomNumber);

      playerList.add(new Player("James"));
      playerList.add(new Player("Harden"));
      playerList.add(new Player("Curry"));
      while(flag){
         for(int i=0;i<playerList.size();i++){
               guessNumber=playerList.get(i).guess();

               if(guessNumber == randomNumber){
                  System.out.println("Congratulations "+playerList.get(i).getName()+"You guessed the number:"+randomNumber);
                  flag = false;
                  break;
               }else{
                     System.out.println(playerList.get(i).getName()+" You were guessing the wrong number "+guessNumber);
                     System.out.println("Keep trying.");
                     }
         }
      }
   }
}
