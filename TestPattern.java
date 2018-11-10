
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern{

   public static SceneType analyseSubtitle(String line) {
      String sceneNumber = "[0-9]*";
      String sceneTimeLine="-->";
      String sceneSubtitleContent="\\D*";
      String patterns [] = {sceneNumber,sceneSubtitleContent};

      for(String regex : patterns) {
         if(Pattern.matches(regex,line)) {
            if(regex.equals(sceneNumber)){ return SceneType.SCENE_ID; }
            if(regex.equals(sceneSubtitleContent)){ return SceneType.SUBTITLE;}
         }
      }
      if(line.contains(sceneTimeLine)){ return SceneType.TIME_LINE;}

      return SceneType.OTHER;
   }
   public static void main(String[] args) {
      System.out.println(analyseSubtitle("2"));
      System.out.println(analyseSubtitle("00:16:48,933 --> 00:16:51,419"));
      System.out.println(analyseSubtitle("je suis vraiment content"));
   }
}

enum SceneType{
	SCENE_ID,
	TIME_LINE,
	SUBTITLE,
	OTHER
}
