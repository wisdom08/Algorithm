package codewars._8kyu;

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}

/*
* https://www.codewars.com/kata/583710ccaa6717322c000105/train/java
* 회고
* 짝수인지 판별하는데 메서드를 별도로 만드는게 좋곘다.
* */