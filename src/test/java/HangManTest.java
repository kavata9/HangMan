import org.junit.Test;
import static org.junit.Assert.*;

public class HangManTest {
    //This tests if it returns a String word
      @Test
      public void getStringWord(){
        HangMan score = new HangMan();
        assertEquals("Test", score.words());
      }
   
}