package leetcode.java;

public class _2114 {
    public static void main(String[] args) {
        Solution_2114 solution = new Solution_2114();
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = solution.mostWordsFound(arr);
        System.out.println("result = " + result);
    }
}

class Solution_2114 {
    public int mostWordsFound_2(String[] sentences) {

        int result = 0;
        int currentCount = 0;

        for (String s : sentences) {
            System.out.println("s = " + s);
            for (int i = 0; i < s.length(); i++) {
                System.out.println("s.charAt(i) = " + s.charAt(i));
                if(s.charAt(i) == ' ') currentCount++;
            }
            result = Math.max(currentCount, result);
            currentCount = 0;
        }

        return result+1;
    }

    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;

        for (int i = 1; i < sentences.length; i++) {
            max = Math.max(sentences[i].split(" ").length, max);
        }
        return max;
    }
}
