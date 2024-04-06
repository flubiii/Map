package ZD3Test;

import org.campus.ZD3.AnagramCheck;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckTest {

    @Test
    public void testAreAnagrams() {
        assertTrue(AnagramCheck.areAnagrams("listen", "silent"));
        assertFalse(AnagramCheck.areAnagrams("hello", "world"));
    }
}

