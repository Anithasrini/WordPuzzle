import java.util.Map;
import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {}

    public String towordPuzzle(String userInput) {
      userInput = userInput.replaceAll("[AEIOUaeiou]", "-");
      // userInput = userInput.equalsIgnoreCase();

      // String wordPuzzle = {"a", "e", "i", "o","u", };
      // String wordPuzzle = {"-", "-", "-", "-", "-"};
          String  str = "userInput";
          int l = str.length();
          for (int i = 0; i <= str.length(); i++) {
          str = str.replaceAll("[AEIOUaeiou]", "-");
          return str;
        // String toWordPuzzle = userInput;
      }
      return "Try Again";
  }
}
