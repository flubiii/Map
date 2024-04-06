package org.campus.ZD5;

// Задача5: Найти максимальное значение среди всех ключей Map

import java.util.Collections;
import java.util.Map;

public class MaxValueInMap {
    public static int findMaxValue(Map<String, Integer> map) {
        return Collections.max(map.values());
    }
}
