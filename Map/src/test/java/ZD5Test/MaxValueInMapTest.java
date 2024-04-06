package ZD5Test;

import org.campus.ZD5.MaxValueInMap;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class MaxValueInMapTest {

    @Test
    public void testFindMaxValue() {
        Map<String, Integer> map = Map.of("a", 10, "b", 5, "c", 20);
        assertEquals(20, MaxValueInMap.findMaxValue(map));
    }
}

