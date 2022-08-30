package codingtest.java;
import java.util.Scanner;

public class _01_01 {
    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        char[] chars = str.toCharArray();

        for (char cha : chars) {
            if(cha == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        int result = solution(str, c);
        System.out.println(result);
    }
}