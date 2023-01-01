package codewars._8kyu;

public class ToBinary {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static int toBinary_2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.append(1);
        return Integer.parseInt(sb.reverse().toString());
    }
}

/*
* https://www.codewars.com/kata/59fca81a5712f9fa4700159a/train/java
* */