package codewars._8kyu;

public class CharProblem {
    public static int howOld(final String herOld) {
        char[] chars = herOld.toCharArray();
        for (Character c : chars) {
            if (Character.isDigit(c)) {
                return Integer.parseInt(c.toString());
            }
        }
        return 0;
    }

    public static int howOld_2(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }
}

/*
* https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java
* 회고
* 아 복잡하게 생각했다. 그냥 첫 번째 값 리턴하면 된다. 문제를 잘 읽어야함!
* */