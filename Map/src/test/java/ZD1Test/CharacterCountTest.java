package ZD1Test;

import org.campus.ZD1.CharacterCount;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class CharacterCountTest {

    @Test
    public void testCountCharacters() {
        Map<Character, Integer> result = CharacterCount.countCharacters("hello");
        assertEquals(Map.of('h', 1, 'e', 1, 'l', 2, 'o', 1), result);
    }
}
