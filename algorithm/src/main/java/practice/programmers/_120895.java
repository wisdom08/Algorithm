package practice.programmers;

public class _120895 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                sb.append(my_string.charAt(num2));
            } else if (i == num2) {
                sb.append(my_string.charAt(num1));
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    public String solution_2(String my_string, int num1, int num2) {
        String[] stringArray = my_string.split("");

        String tmp = stringArray[num1];
        stringArray[num1] = stringArray[num2];
        stringArray[num2] = tmp;

        return String.join("",stringArray);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120895