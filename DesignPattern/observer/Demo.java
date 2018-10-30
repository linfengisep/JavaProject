public class Demo{
   public static void main(String[] args) {
      int stockValueInMarket = 1989;

      StockMarketSubject stockSuject = new StockMarketSubject();

      GoogleStockObserver googleObserver = new GoogleStockObserver(stockSuject);
      AppleStockObserver AppleObserver = new AppleStockObserver(stockSuject);

      stockSuject.setStockValue(stockValueInMarket);
      stockSuject._notify();
   }
}
