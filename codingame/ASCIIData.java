import java.io.Reader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.lang.Character;
public class ASCIIData{
    public static void main(String[] args) throws IOException {
        System.out.println(" # \n# #\n###\n# #\n# #\n");
        switch(" # \n# #\n###\n# #\n# #\n"){
            case " # \n# #\n###\n# #\n# #\n":System.out.println("A");break;
            case "hello":System.out.println("hello");break;
            default:System.out.println("default");
        }

        Map<String,String> map = new HashMap<>();
        map.put(
        " # \n" +
        "# #\n" +
        "###\n" +
        "# #\n" +
        "# #\n", "A"
        );
        map.put(
        "## \n" +
        "# #\n" +
        "## \n" +
        "# #\n" +
        "## \n", "B"
        );
        map.put(
        " ##\n" +
        "#  \n" +
        "#  \n" +
        "#  \n" +
        " ##\n", "C"
        );
        map.put(
        "## \n" +
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "## \n", "D"
        );
        map.put(
        "###\n" +
        "#  \n" +
        "###\n" +
        "#  \n" +
        "###\n", "E"
        );
        map.put(
        "###\n" +
        "#  \n" +
        "## \n" +
        "#  \n" +
        "#  \n", "F"
        );
        map.put(
        " ##\n" +
        "#  \n" +
        "# #\n" +
        "# #\n" +
        " ##\n", "G"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        "###\n" +
        "# #\n" +
        "# #\n", "H"
        );
        map.put(
        "###\n" +
        " # \n" +
        " # \n" +
        " # \n" +
        "###\n", "I"
        );
        map.put(
        " ##\n" +
        "  #\n" +
        "  #\n" +
        "# #\n" +
        " # \n", "J"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        "## \n" +
        "# #\n" +
        "# #\n", "K"
        );
        map.put(
        "#  \n" +
        "#  \n" +
        "#  \n" +
        "#  \n" +
        "###\n", "L"
        );
        map.put(
        "# #\n" +
        "###\n" +
        "###\n" +
        "# #\n" +
        "# #\n", "M"
        );
        map.put(
        "###\n" +
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "# #\n", "N"
        );
        map.put(
        "###\n" +
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "###\n", "O"
        );
        map.put(
        "## \n" +
        "# #\n" +
        "## \n" +
        "#  \n" +
        "#  \n", "P"
        );
        map.put(
        " # \n" +
        "# #\n" +
        "# #\n" +
        " ##\n" +
        "  #\n", "Q"
        );
        map.put(
        "## \n" +
        "# #\n" +
        "## \n" +
        "# #\n" +
        "# #\n", "R"
        );
        map.put(
        " ##\n" +
        "#  \n" +
        " # \n" +
        "  #\n" +
        "## \n", "S"
        );
        map.put(
        "###\n" +
        " # \n" +
        " # \n" +
        " # \n" +
        " # \n", "T"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "###\n", "U"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        "# #\n" +
        "# #\n" +
        " # \n", "V"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        "###\n" +
        "###\n" +
        "# #\n", "W"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        " # \n" +
        "# #\n" +
        "# #\n", "X"
        );
        map.put(
        "# #\n" +
        "# #\n" +
        " # \n" +
        " # \n" +
        " # \n", "Y"
        );
        map.put(
        "###\n" +
        "  #\n" +
        " # \n" +
        "#  \n" +
        "###\n", "Z"
        );
        map.put(
        "###\n" +
        "  #\n" +
        " ##\n" +
        "   \n" +
        " # \n", "?"
        );
        //not contain a certain key, print ?
        if(! map.containsKey("###\n" +
        "  #\n" +
        " ##\n" +
        "## \n" +
        "###\n")) System.out.println("?");

        Map<String,Character> letters = new HashMap<>();
        letters.put("ok",new Character('o'));
        letters.put("yes",new Character('y'));
        for(Map.Entry<String,Character> entry:letters.entrySet()){
            System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
        }

        /* === Code for testing ===
        ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
        ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
        ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
        ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
        ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
        */
    }
}
