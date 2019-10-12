/*
1.The base case：prove the statement true for some specific value or values of n (usually 0 or 1).
2.The induction step:assume that the statement to be true for all positive integers less than n, then use that fact to prove it true for n
*/
class Incursion{
  public static long factorial(int n){
      if(n == 1) return 1;
      return n * factorial(n-1);
  }

  //the grestest common divisor;
  public static long gcd(int m,int n){
    if(n == 0) return m;
    return gcd(n,m%n);
  }

  //tour of hanoi

  public static long tourHanoi(){
    
  }

  public static void main(String[] args) {
    System.out.println("res factorial:"+factorial(5));
    System.out.println("res gcd:"+gcd(128,64));
  }
}
