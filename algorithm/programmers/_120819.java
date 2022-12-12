package programmers;

public class _120819 {
    public int[] solution(int money) {
        final int PRICE = 5500;
        return new int[]{money / PRICE, money % PRICE};
    }

    public int[] solution_2(int money) {
        final int PRICE = 5500;
        int[] answer = new int[2];

        while (money >= PRICE) {
            ++answer[0];
            money -= PRICE;
        }

        answer[1] = money;

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120819