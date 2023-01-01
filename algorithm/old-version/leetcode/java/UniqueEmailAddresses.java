/**
 * https://leetcode.com/problems/unique-email-addresses/
 * 문제 분석
 * 로컬네임+도메인네임
 * 로컬네임에서는 . 무시
 * 로컬네임에서 + 이후로 나오는 문자열 무시
 * 도메인네임에서는 . 무시X
 *
 * 규칙 찾기
 * . -> Continue로 뺀다.
 * + -> break로 뺀다.
 *
 * 계획
 * 1. subString / chatAt() / 수정된 String 을 Set 에 넣는다.
 * 2. split
 **/

package leetcode.java;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        int secondResult = solution.numUniqueEmails_split(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        System.out.println("result = " + result);
        System.out.println("secondResult = " + secondResult);
    }
}

class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);

            set.add(localName + "@" + domainName);
        }
        return set.size();
    }

    private String makeDomainName(String email) {
        return email.substring(email.indexOf('@')+1);
    }
    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.') {
                continue;
            }

            if (email.charAt(i) == '+' || email.charAt(i) == '@') {
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    public int numUniqueEmails_split(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".", "") + "@" + parts[1]);
        }

        return set.size();
    }
}

/**
 * 회고
 * HashSet 이 참 유용하다. 내부적으로 어떻게 동작하는지 궁금하다. 다음에 찾아봐야겠다.
 */
