package codewars._6kyu;

import java.util.ArrayList;

public class StringSplit {
    public static String[] solution(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i+=2) {
            sb.setLength(0);
            if (i + 1 > s.length() - 1) {
                sb.append(String.valueOf(s.charAt(i))).append("_");
                list.add(sb.toString());
                break;
            }
            sb.append(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)));
            list.add(sb.toString());
        }
        return list.stream().toArray(String[]::new);
    }
}

// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
// StringBuilder 를 초기화할 때 여러가지 방법이 있는데 setLength(0) 을 이용하는 것이 가장 빠르다고 한다. 추가로 delete() 메서드도 알게 됐다.