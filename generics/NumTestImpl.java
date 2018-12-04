public class NumTestImpl implements NumTest<Integer>{
   @Override
   public boolean test(Integer t){
      return t % 2 ==0;
   }
}
