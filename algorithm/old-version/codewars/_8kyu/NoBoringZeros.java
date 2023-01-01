package codewars._8kyu;

public class NoBoringZeros {
    public static int noBoringZeros(int n) {
        while (n != 0 && n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }
}

/*
 * https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java
 * */