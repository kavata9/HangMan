import org.junit.Test;
import static org.junit.Assert.*;

public class HangManTest {
    @Test public void testHangManInstatiatesCorrectly() {
         HangMan scorer= new HangMan("moringa");
        assertNotNull(scorer);
    }
}
