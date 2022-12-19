package programmers;

public class _120818 {
    public int solution(int price) {
        if (price >= 500000) return (int) (price - (price * 0.2));
        if (price >= 300000) return (int) (price - (price * 0.1));
        if (price >= 100000) return (int) (price - (price * 0.05));
        return price;
    }

    public int solution_2(int price) {
        double off = ((price >= 500000) ? (0.8)
                : ((price >= 300000) ? (0.9)
                : ((price >= 100000) ? (0.95)
                : (1.0))));

        return (int) (price * off);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120818
