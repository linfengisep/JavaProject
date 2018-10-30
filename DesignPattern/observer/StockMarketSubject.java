import java.util.ArrayList;

public class StockMarketSubject implements Subject{
   public int stockValue;
   public ArrayList<Observer> listObservers = new ArrayList<>();

   public void setStockValue(int value){
      stockValue=value;
      displayValue(value);
   }
   public int getStockValue(){
      return stockValue;
   }

   public void displayValue(int value){
      System.out.println("Value in stock market:"+value);
   }
   @Override
   public void register(Observer observer){
      listObservers.add(observer);
   }
   @Override
   public void unregister(Observer observer){
      int index = listObservers.indexOf(observer);
      listObservers.remove(index);
   }

   public void _notify(){
      for(Observer observer : listObservers){
         observer.update(stockValue);
      }
   }
}
