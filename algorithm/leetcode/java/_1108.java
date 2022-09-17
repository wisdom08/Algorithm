package leetcode.java;

public class _1108 {
    public static void main(String[] args) {
        Solution_1108 s = new Solution_1108();
        String result = s.defangIPaddr("1.1.1.1");
        System.out.println("result = " + result);
    }
}


class Solution_1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
/*
* https://leetcode.com/problems/defanging-an-ip-address/
* 회고
* replace 외에도 다양한 방법으로 추가로 어떻게 풀 수 있을지 고민해봐야겠다. 문제는 간단하게 해결할 수 있지만 추가적인 인사이트를 얻을 수 있는 문제라고 생각한다. 
* */