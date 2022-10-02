package codewars._7kyu;

public class YouAreSquare {

    public static void main(String[] args) {
        boolean square = isSquare_2(-4);
        System.out.println("square = " + square);
    }

    public static boolean isSquare(int n) {
        if (Math.pow(n, 0.5) % 1 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isSquare_2(int n) {
        if (Math.sqrt(n) % 1 == 0) {
            return true;
        }
        return false;
    }
}

/*
* https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
* 회고
* 제곱근을 구하는 메서드 Math.sqrt()의 존재를 알았다. Math.pow()를 쓰는 것보다 더 직관적으로 보인다. 
* */