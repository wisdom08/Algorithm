package programmers;

public class _120830 {
    public int solution(int n, int k) {
        int mainPrice = 12000;
        int sodaPrice = 2000;
        int discount = n / 10;
        return n*mainPrice + k*sodaPrice - (discount*sodaPrice);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120830
