import java.util.*;
import java.io.*;
import java.math.*;

/**
 * 1.String.substring();
 * 2.String.toCharArray();
 * 3.char, can be used to add or addition
 **/
class ASCIIART {
    public static final char START = 'a';
    public static final char END = 'z';

    public static String getArtString(char c,int artLength,String rowInput){
        String output="";
        int start = (c-START)*artLength;
        int end = start+artLength;
        if(c>=START && c<= END){
          output = rowInput.substring(start,end);
        }else{
          output = rowInput.substring(26*artLength,27*artLength);
        }
        //System.err.println(output);
        return output;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //the length of the art caracter;
        int L = in.nextInt();
        //the height of the art caracter;
        int H = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }
        //the text to be represented by the art caracter;
        String T = in.nextLine();

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            //get every char in the text;
            String artOutput="";
            for(char c :T.toLowerCase().toCharArray()){
                //System.err.println("char:"+c);
                artOutput=String.format("%s%s",artOutput,getArtString(c,L,ROW));
            }
            System.out.println(artOutput);
        }
    }
}
