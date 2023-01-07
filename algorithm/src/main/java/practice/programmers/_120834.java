package practice.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

//  a는 0, b는 1, c는 2, ..., j는 9

/*
 * 맵에 a,~j 를 숫자 0~9에 맵핑해서 넣는다.
 * 주어진 파라미터 값이 맵에서 어떤 값과 일치하는지 체크한다.
 * stringbuild 자료 구조에 하나 씩 더해나간다.
 * */
public class _120834 {
    public String solution(int age) {

        StringBuilder sb = new StringBuilder();

        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, (char) (97 + i));
        }

        String s = String.valueOf(age);
        for (char c : s.toCharArray()) {
            sb.append(map.get(Integer.parseInt(Character.toString(c))));
        }

        return sb.toString();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120834
