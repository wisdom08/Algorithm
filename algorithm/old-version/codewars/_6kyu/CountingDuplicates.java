package codewars._6kyu;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static void main(String[] args) {
        int result = duplicateCount("Indivisibilities");
        System.out.println("result = " + result);
    }
    public static int duplicateCount(String text) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (Character s : text.toUpperCase().toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character) >= 2) {
                result++;
            }
        }

        return result;
    }
}

/*
* https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
* 회고
* map 공간을 하나 더 만들어서 그 중 중복된 문자를 담은 map 의 사이즈를 반환해서 문제를 해결하는 답안도 많았다.
* */