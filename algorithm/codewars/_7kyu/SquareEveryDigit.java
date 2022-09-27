package codewars._7kyu;

public class SquareEveryDigit {

    public static void main(String[] args) {
        int result = SquareDigit.squareDigits(9119);
        System.out.println("result = " + result);
    }

    public class SquareDigit {
        public static int squareDigits(int n) {
            String strNumber = String.valueOf(n);
            String[] digits = strNumber.split("");
            StringBuilder sb = new StringBuilder();

            for (String digit : digits) {
                int i = Integer.parseInt(digit);
                sb.append(i * i);
            }

            return Integer.parseInt(sb.toString());
        }
    }
}

/*
* https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
* 회고
* 다른 사람들이 스트림으로 작성한 답안을 좀 더 잘 이해하고 싶다. 스트림을 좀 공부해야겠다.
* */