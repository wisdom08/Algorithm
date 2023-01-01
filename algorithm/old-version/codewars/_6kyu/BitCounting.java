package codewars._6kyu;

public class BitCounting {
    public static void main(String[] args) {
        int i = countBits_2(1234);
        System.out.println("i = " + i);
    }
    public static int countBits(int n){
        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }

    public static int countBits_2(int n){
        return Integer.bitCount(n);
    }
}


/*
* https://www.codewars.com/kata/526571aae218b8ee490006f4/solutions/java
* 회고
* 주어진 정수를 비트로 변환하여 그 비트에서 1의 개수만을 세어주는 bitCount 메서드를 알게됨. 관련 문제를 쉽게 풀 수 있을 것같다!
* 내가 푼 방식도 괜찮은 풀이라고 느껴진다. 의식의 흐름대로 키보드를 두드렸는데.. 생각을 먼저 하고 풀었으면 더 좋았을 것 같다.
* */