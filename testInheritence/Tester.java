public class Tester{
    public static void swapPrimitiveData(int a,int b){
        int temp = 0;
        temp = b;
        b = a;
        a = temp;
    }

    //public static Sample swapObject(Sample a,Sample b){
    public static void swapObject(Sample a,Sample b){
        Sample temp = a;
        a = b;
        b = temp;
        System.out.format("after swap inside swap ->a:%s,b:%s\n",a.toString(),b.toString());
    }

    public static void main(String[] args) {
        int x=10,y=20;
        System.out.format("before swap->x:%d,y:%d\n",x,y);
        swapPrimitiveData(x,y);
        System.out.format("x:%d,y:%d\n",x,y);

        //Object
        Sample sample1 = new Sample("sample1");
        Sample sample2 = new Sample("sample2");
        //System.out.println("sample1:"+swapObject(sample1,sample2).toString());
        System.out.format("after swap outside swap ->sample1:%s,sample2:%s\n",sample1.toString(),sample2.toString());

        //casting
        Super mySup  = new Super();
        Sub sub = (Sub) mySup;
    }
}
