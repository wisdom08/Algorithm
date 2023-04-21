package practice.programmers;

public class _181876 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }

    public String solution_2(String myString) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            Character c = myString.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)('a' + c - 'A'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}

// https://school.programmers.co.kr/learn/courses/30/lessons/181876
