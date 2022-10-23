package codewars._8kyu;

public class QuarterOf {
    public static int quarterOf(int month) {
        if (month < 4) {
            return 1;
        }

        if (month < 7) {
            return 2;
        }

        if (month < 10) {
            return 3;
        }

        return 4;
    }
}

/*
* https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/java
* */