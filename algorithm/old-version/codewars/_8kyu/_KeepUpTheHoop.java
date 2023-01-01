package codewars._8kyu;

import java.util.HashMap;
import java.util.Map;

public class _KeepUpTheHoop {
    public static String hoopCount(int n){
        if (n >= 10) {
            return "Great, now move on to tricks";
        }
        return "Keep at it until you get it";
    }

    public static String hoopCount_2(int n){
        Map<Boolean, String> phrase = new HashMap<>();
        phrase.put(true, "Great, now move on to tricks");
        phrase.put(false, "Keep at it until you get it");

        return phrase.get(n >= 10);
    }
}

/*
* https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145/java
* 회고
* 다른 사람이 해시맵으로 푼 걸 보고 인상적이어서 답안에 추가했다. 이 문제에 해시맵을 떠올라다니?
* */