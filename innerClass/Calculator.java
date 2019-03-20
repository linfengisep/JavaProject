public class Calculator{

    interface Operation{
        int doMath(int a,int b);
    }

    public int getResult(int a, int b,Operation op){
        return op.doMath(a,b);
    }

    public static void main(String[] args) {
        int m = 20, n=5;
        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult(m,n,(a,b)->a+b));
        System.out.println(calculator.getResult(m,n,(a,b)->a-b));
        System.out.println(calculator.getResult(m,n,(a,b)->a*b));
        System.out.println(calculator.getResult(m,n,(a,b)->a/b));
        //two parameter, then the parenthese is mandatory,
        // body is a expression, so i omit brace.
        //this is why i say the lambda expression is a special case(only one method) of anonymous class
        int result = calculator.getResult(m,n,new Operation(){
            public int doMath(int a,int b){
                return a + b;
            }
        });
        System.out.println("result:"+result);
    }
}
