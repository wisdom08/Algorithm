package codewars._8kyu;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (array.length-1 < n) {
            return -1;
        }
        return (int) Math.pow(array[n], n);
    }
}

/*
* https://www.codewars.com/kata/57d814e4950d8489720008db/train/java
* */