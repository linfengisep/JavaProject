public class StringTester{
    /*
        String are created in two way;
        using new: then it will be stored in heap;
        using String s = "s": then it will be stored in String Constant Pool(a special area in heap,no duplication)
        note: if two string storing the same constent, the two string point to the same object(same address);
    */
    private static final String TESTER = "TESTER";
    private static final int LENGTH = 10000000;
    private static void testStringAddress(){
        System.out.println("******Using literal**********");
        String s1 = TESTER;
        String s2 = TESTER;
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println("******Using new**********");
        String s3 = new String(TESTER);
        String s4 = new String(TESTER);
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
    }
    public static void testStringBuffer(){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<LENGTH;i++){
            sb.append(i);
        }
    }
    public static void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<LENGTH;i++){
            sb.append(i);
        }
    }
    public static void main(String[] args) {
        final long start = System.nanoTime();
        //testStringAddress();
        //testStringBuilder();
        testStringBuffer();
        final long duration = System.nanoTime() - start;
        System.out.println(duration);
    }
}
