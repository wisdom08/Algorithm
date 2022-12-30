package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _120839 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            sb.append(rsp.split("")[i].equals("2") ? "0"
                    : rsp.split("")[i].equals("0") ? "5" : "2");
        }
        return sb.toString();
    }

    public String solution_2(String rsp) {
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120839