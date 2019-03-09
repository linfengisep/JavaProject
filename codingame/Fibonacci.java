import java.util.*;

public class Fibonacci{
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static boolean belongsToFibonacci(int a,int b){
        int bigger = Math.max(a,b);
        int result = 0,index = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(result < bigger){
            result = fibonacci(index++);
            list.add(result);
        }
        return list.get(list.size()-2)==Math.min(a,b);
    }

    public static void main(String[] args) {
        System.out.println(belongsToFibonacci(1,0));
    }
}
