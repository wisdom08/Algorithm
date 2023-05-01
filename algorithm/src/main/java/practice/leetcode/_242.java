package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _242 {
    public static void main(String[] args) {
        Solution_242 solution = new Solution_242();
        boolean result = solution.isAnagram("anagram", "nagaram");
        System.out.println("result = " + result);
    }
}

class Solution_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if(count!=0) return false;
        }

        return true;
    }

    public boolean isAnagram_2(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> mapForS = new HashMap<>();
        Map<Character, Integer> mapForT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapForS.put(s.charAt(i), mapForS.getOrDefault(s.charAt(i), 0) + 1);
            mapForT.put(t.charAt(i), mapForT.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (!mapForS.equals(mapForT)) {
            return false;
        }
        return true;
    }
}

// https://leetcode.com/problems/valid-anagram/
