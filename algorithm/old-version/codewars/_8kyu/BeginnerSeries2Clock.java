package codewars._8kyu;

public class BeginnerSeries2Clock {
    public static int Past(int h, int m, int s) {
        int secondsToMilliseconds = s * 1000;
        int minutesToMilliseconds = m * 60000;
        int hoursToMilliseconds = h * 3600000;
        return secondsToMilliseconds + minutesToMilliseconds + hoursToMilliseconds;
    }
}

/*
* https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
* 회고
* 문제에 input 값 조건으로 범위가 주어져있는데 input 값 조건을 체크하는 답안도 많았다. 조건 체크말고는 간단한 문제라 푸는 방식이 다 비슷한 것같다.
* */