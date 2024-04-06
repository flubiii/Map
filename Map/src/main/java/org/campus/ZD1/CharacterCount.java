package org.campus.ZD1;

// Задача1: Подсчет количества вхождений каждого символа в строке

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> characterCounts = new HashMap<>();
        for (char ch : input.toCharArray()) {
            characterCounts.put(ch, characterCounts.getOrDefault(ch, 0) + 1);
        }
        return characterCounts;
    }
}
