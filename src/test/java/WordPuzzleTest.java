import org.junit.*;
import static org.junit.Assert.*;


  public class WordPuzzleTest {


     @Test
     public void WordPuzzle_replacesVowelAInAStringToDashSymbol_wordChanges() {
         WordPuzzle wordPuzzle = new WordPuzzle();
         assertEquals("-pple", wordPuzzle.toWordPuzzle("apple"));
      }
      @Test
      public void WordPuzzle_replacesVowelEInAStringToDashSymbol_wordChanges() {
          WordPuzzle wordPuzzle = new WordPuzzle();
          assertEquals("-ppl-", wordPuzzle.toWordPuzzle("apple"));
       }
      @Test
       public void WordPuzzle_replacesVowelIInAStringToDashSymbol_wordChanges() {
           WordPuzzle wordPuzzle = new WordPuzzle();
           assertEquals("-r-l-nd", wordPuzzle.toWordPuzzle("Ireland"));
        }
     @Test
        public void WordPuzzle_replacesVowelOInAStringToDashSymbol_wordChanges() {
            WordPuzzle wordPuzzle = new WordPuzzle();
            assertEquals("c-l-r", wordPuzzle.toWordPuzzle("color"));
         }
      @Test
          public void WordPuzzle_replacesVowelUInAStringToDashSymbol_wordChanges() {
            WordPuzzle wordPuzzle = new WordPuzzle();
            assertEquals("-gly ", wordPuzzle.toWordPuzzle("ugly"));
            }
      @Test
          public void WordPuzzle_replacesVowelsAEIOUInAStringToDashSymbol_wordChanges() {
            WordPuzzle wordPuzzle = new WordPuzzle();
            assertEquals("B-l--v-y--c-n-ndy--'r-h-lf-y' ", wordPuzzle.toWordPuzzle("Beleive you can and you're halfway"));
           }

        @Test
            public void
              Vowels_ifWordDoesNotContainsVowelsReturnTheWord_wordDoesntChange() {
              WordPuzzle puzzleGame = new WordPuzzle();
              asserEquals("Dry", wordPuzzle.towordpuzzle("Dry"));
            }

  }
