package org.campus.ZD3;

// Задача3: Проверить, являются ли две строки анаграммами

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            counts.put(str1.charAt(i), counts.getOrDefault(str1.charAt(i), 0) + 1);
            counts.put(str2.charAt(i), counts.getOrDefault(str2.charAt(i), 0) - 1);
        }
        for (int count : counts.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

