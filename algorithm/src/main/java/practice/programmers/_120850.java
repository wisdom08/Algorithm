package practice.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120850 {

    public int[] solution_2(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");

        String[] arr = my_string.split("");
        int[]answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);

        return answer;
    }

    public int[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            char characterData = my_string.charAt(i);

            if (Character.isDigit(characterData)) {
                list.add(String.valueOf(characterData));
            }
        }

        return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }
}

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/120850#
* parseInt() :  will be returning the primitive type int
* valueOf() : will be returning the Integer wrapper Object
* */