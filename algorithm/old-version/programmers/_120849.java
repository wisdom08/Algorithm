package programmers;

public class _120849 {
    public static void main(String[] args) {
        String niceToMeetYou = solution_2("nice to meet you");
        System.out.println("niceToMeetYou = " + niceToMeetYou);
    }
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] chars = my_string.toCharArray();

        for (Character c : chars) {
            if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') ||c.equals('u')){
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String solution_2(String my_string) {
        return my_string.replace("a", "")
                .replace("e", "")
                .replace("o", "")
                .replace("u", "")
                .replace("i", "");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
