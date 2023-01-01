package codewars._8kyu;

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        int points = points_2(
            new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"});
        System.out.println("points = " + points);
    }
    public static int points(String[] games) {
        int result = 0;
        for (String game : games) {
            int ours = Integer.parseInt(game.substring(0, 1));
            int opponents = Integer.parseInt(game.substring(2));
            if (ours > opponents) {
                result+=3;
            } else if (ours == opponents) {
                result += 1;
            }

        }
        return result;
    }

    public static int points_2(String[] games) {
        int result = 0;
        for (String game : games) {
            char ours = game.charAt(0);
            char opponents = game.charAt(2);
            result += ours > opponents ? 3 : ours == opponents ? 1 : 0;
        }
        return result;
    }
}

/*
* https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
* 회고
* Integer.compare(a, b) 메서드를 알게 됐다. -> Returns: the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
* */