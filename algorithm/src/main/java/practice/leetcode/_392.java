package practice.leetcode;

public class _392 {
    public static void main(String[] args) {
        Solution_392 solution392 = new Solution_392();
        boolean subsequence = solution392.isSubsequence("abc", "ahbgdc");
        System.out.println("subsequence = " + subsequence);
    }
}

class Solution_392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)){
                if(++i==s.length()) return true;
            }
        }
        return false;
    }
}
