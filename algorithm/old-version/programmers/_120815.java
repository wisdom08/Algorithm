package programmers;

public class _120815 {
    public int solution(int n) {
        int pizzas = 6;
        while (pizzas % n != 0) {
            pizzas+=6;
        }
        return pizzas / 6;
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120815