package codewars._6kyu;

public class CreatePhoneNumber {

    public static void main(String[] args) {
        String phoneNumber = createPhoneNumber_2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println("phoneNumber = " + phoneNumber);
    }
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
            numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumber_2(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int j = 0; j < 3; j++) {
            sb.append(numbers[j]);
        }
        sb.append(") ");

        for (int j = 3; j <6 ; j++) {
            sb.append(numbers[j]);
        }
        sb.append("-");

        for (int j = 6; j <numbers.length ; j++) {
            sb.append(numbers[j]);
        }
        return sb.toString();
    }
}

/*
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * 회고
 * 이 문제는 꼭 다시 풀어보고 싶다. -> append 하는 방식으로 풀어봄

 * 아래 방식으로 다른 사람이 푼 걸 보고 정말 생각하지 못한 방법이어서 감탄사가 바로 나왔다. 해당 답안을 통해 replaceFirst() 메서드의 존재와 replace() 와 replaceFirst() 의 차이를 배웠다.
 * String phoneNumber = new String("(xxx) xxx-xxxx");

    for (int i : numbers) {
      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    }
 * */

