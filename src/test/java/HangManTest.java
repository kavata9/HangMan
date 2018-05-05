import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class HangManTest {
    //This tests if it returns a String word
      @Test
      public void getStringWord(){
        HangMan score = new HangMan();
        assertEquals("Tiger", score.words());
      }
      @Test
    public void getStringRandomword(){
      HangMan score = new HangMan();
      assertEquals("Tiger", score.words());
    }
}