package org.campus.ZD4;

// Задача4: Суммировать значения по каждому ключу в двух Map

import java.util.HashMap;
import java.util.Map;

public class SumValuesByKey {
    public static Map<String, Integer> sumValues(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        map2.forEach((key, value) -> result.merge(key, value, Integer::sum));
        return result;
    }
}
