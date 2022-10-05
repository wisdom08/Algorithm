package codewars._7kyu;

public class ExesAndOhs {

    public static void main(String[] args) {
        boolean xxxXooOo = getXO("xxxXooOo");
        System.out.println("xxxXooOo = " + xxxXooOo);
    }
    public static boolean getXO (String str) {
        int xCount = 0, oCount = 0;
        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == 'x') {
                ++xCount;
            } else if (c == 'o') {
                ++oCount;
            }
        }
        if (xCount == oCount) {
            return true;
        }
        return false;
    }
}

/*
* https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
* 회고
* replace() 메서드를 활용해서 x 혹은 o 인 경우에 공백으로 바꾸고 각각 길이를 구하는 방법도 있다. 다른 문제를 풀었을 때 이렇게 푼 방식을 본 적이 있는 것 같은데
* 문제를 계속 풀면서 문제를 해결하는 다양한 방법을 익히고 있는 거 같아서 좋다.
* */