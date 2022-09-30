package codewars._6kyu;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
            numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}

/*
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * 회고
 * 이 문제는 꼭 다시 풀어보고 싶다.
 * */