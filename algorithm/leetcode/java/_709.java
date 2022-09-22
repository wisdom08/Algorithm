package leetcode.java;

public class _709 {
    public static void main(String[] args) {
        Solution_709 s = new Solution_709();
        String result = s.toLowerCase_2("Hello");
        System.out.println("result = " + result);
    }
}

class Solution_709 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase_2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c > 64 && c < 91 ? (char) (c + 32) : c);
        }
        return new String(sb);
    }
}


/*
* https://leetcode.com/problems/to-lower-case/
* 회고
* toLowerCase 말고 다른 방법으로도 풀어보고 싶었는데 아스키코드가 생각 났고 A과 Z가 어디 범위인지는 기억이 안나서 검색해서 풀었다.
* 2가지 방식으로 문제를 풀고 또 다른 방법은 없나? 하고 찾아봤는데 보이진 않는다.
* */