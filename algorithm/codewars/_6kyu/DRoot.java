package codewars._6kyu;

public class DRoot {

    public static void main(String[] args) {
        int i = digital_root(942);
        System.out.println("i = " + i);
    }

    public static int digital_root(int n) {
        while (n >= 10) {
            n = getSum(n);
        }
        return n;
    }

    private static int getSum(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum +=Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}

/*
* https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
* 회고
* Character.getNumericValue() 메서드를 유용하게 잘 쓸 수 있을 것 같다.
* */