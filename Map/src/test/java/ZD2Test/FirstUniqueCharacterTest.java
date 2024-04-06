package ZD2Test;

import org.campus.ZD2.FirstUniqueCharacter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterTest {

    @Test
    public void testFindFirstUniqueChar() {
        assertEquals('h', FirstUniqueCharacter.findFirstUniqueChar("hello"));
    }
}
