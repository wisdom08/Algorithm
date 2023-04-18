package practice.programmers;

public class _12934 {
    public long solution(long n) {
        return Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
