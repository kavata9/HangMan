import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class HangManTest {
  // This tests if it returns a String
  @Test
  public void getStringWord() {
    HangMan words = new HangMan();
    assertEquals("Tiger", words.words());
  }

  // This will Test if the random picker works
  @Test
  public void getRandomword() {
    HangMan words = new HangMan();
    assertEquals("Tiger", words.randWords());
  }
  @Test
    public void checkSplitting(){
      HangMan words = new HangMan();
      String[] myVar = {"p","e","a","c","e"};
      assertEquals (myVar, words.splitWords("peace"));
    }
    // /This test will breakup the user Input to portions of latters
    @Test
    public void breakupUserInput(){
      HangMan words = new HangMan();
      String[] myVar1 ={"p","e","a","c","e"};
      assertEquals(myVar1,words.breakupUserInput("peace"));
    }
  }
