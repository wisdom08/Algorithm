/*
 * https://leetcode.com/problems/license-key-formatting/
 * 문제 분석
 * -를 없애기
 * 대문자로 만들기
 * k로 문자열 나누기
 * 나눈 문자열 사이 -(dash) 넣기
 *
 * 계획
 * replace()
 * toUpperCase()
 * k개로 파싱하고, - 넣기
 * */

package leetcode.java;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        String result = solution.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        System.out.println("result = " + result);
    }
}

class Solution03 {
    public String licenseKeyFormatting(String s, int k) {

        s = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();

        for (int i = k; i < length; i = i + k) {
            sb.insert(length - i, '-');
        }
        return sb.toString();
    }
}

/*
* 회고
* StringBuilder 에서 insert 메서드를 처음 써봐서 신기하다
* */
