package practice.leetcode;

public class _58 {
    public static void main(String[] args) {
        Solution_58 solution58 = new Solution_58();
        int result = solution58.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("result = " + result);
    }
}

class Solution_58 {
    public int lengthOfLastWord(String s) {
        String[] splittedWord = s.split(" ");
        return splittedWord[splittedWord.length - 1].length();
    }
}

// https://leetcode.com/problems/length-of-last-word/
