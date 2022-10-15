package codewars._8kyu;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        int winner = 0;
        if (p1.equals("scissors") && p2.equals("paper")
        || p1.equals("rock") && p2.equals("scissors")
        || p1.equals("paper") && p2.equals("rock")
        ) {
            winner = 1;
        } else if (p2.equals("scissors") && p1.equals("paper")
            || p2.equals("rock") && p1.equals("scissors")
            || p2.equals("paper") && p1.equals("rock")) {
            winner = 2;
        } else {
            return "Draw!";
        }

        return String.format("Player %d won!", winner);
    }
}

/*
* https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
* 회고
* 지금 푼 방식에서 다른 답안들을 참고해서 개선해보자면,
* 가장 먼저 draw 체크를 하고, p1이 이긴 경우가 아니라면 p2가 이기는 것이기 때문에 p2에서는 조건 체크를 할 필요가 없다. 반복되는 조건 체크를 제거하는 게 낫겠다.
* */