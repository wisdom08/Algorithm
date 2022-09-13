package leetcode.java;

public class _20 {
    public static void main(String[] args) {
        Solution_20 solution_20 = new Solution_20();
        boolean valid = solution_20.isValid("()[]{}");
        System.out.println("valid = " + valid);
    }
}


class Solution_20 {
    public boolean isValid(String s) {
        int len = 0;
        do {
            len = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (len != s.length());

        return s.isBlank();
    }
}