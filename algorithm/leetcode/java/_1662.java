package leetcode.java;

public class _1662 {
    public static void main(String[] args) {
        Solution_1662 s = new Solution_1662();
        boolean result = s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println("result = " + result);
    }
}

class Solution_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
}

/*
* https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
* 회고
* String.join() 을 이용해서도 간단하게 풀 수 있다는 걸 알았다.
* */