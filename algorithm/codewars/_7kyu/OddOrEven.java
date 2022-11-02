package codewars._7kyu;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum%2==0 ? "even" : "odd";
    }
}

/*
* https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
* */
