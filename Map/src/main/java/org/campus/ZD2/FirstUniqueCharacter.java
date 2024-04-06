package org.campus.ZD2;

// Задача2: Вернуть первый неповторяющийся символ в строке

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static char findFirstUniqueChar(String input) {
        Map<Character, Integer> characterCounts = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            characterCounts.put(ch, characterCounts.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No unique character found.");
    }
}
