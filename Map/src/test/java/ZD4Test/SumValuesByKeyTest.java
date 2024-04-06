package ZD4Test;

import org.campus.ZD4.SumValuesByKey;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class SumValuesByKeyTest {

    @Test
    public void testSumValues() {
        Map<String, Integer> map1 = Map.of("a", 3, "b", 5);
        Map<String, Integer> map2 = Map.of("a", 1, "c", 7);
        Map<String, Integer> expectedResult = Map.of("a", 4, "b", 5, "c", 7);
        assertEquals(expectedResult, SumValuesByKey.sumValues(map1, map2));
    }
}