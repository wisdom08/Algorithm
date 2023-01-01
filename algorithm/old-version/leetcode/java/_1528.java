package leetcode.java;

public class _1528 {
    public static void main(String[] args) {
        Solution__1528 s = new Solution__1528();
        String result = s.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println("result = " + result);
    }
}

class Solution__1528 {
    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}

/*
* https://leetcode.com/problems/shuffle-string
* 회고
* char[] 를 다시  String 으로 바꾸는 방법이 기억나지 않아서 chars[] to String 이라고 구글링을 해서 이 문제를 해결했다.
* String.valueOf() 정도는 기억하고 있어야하지 않나? 라고 느꼈다.
* */