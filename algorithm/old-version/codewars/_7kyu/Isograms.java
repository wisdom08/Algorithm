package codewars._7kyu;

import java.util.HashSet;

public class Isograms {

    public static void main(String[] args) {
        boolean result = isIsogram2("");
        System.out.println("result = " + result);
    }
    public static boolean  isIsogram(String str) {
        /*
        * - 대소문자 구분은 무시하고, 중복되는 문자가 있으면 false, 없으면 true
        * 모두 소문자로 변경한다.
        * 원래 길이 저장하고, set에 중복제거하고 저장해서 길이가 달라지면 중복되는 문자가 있었다는 말이니까 false를 리턴한다.
        * */
        HashSet<Character> set = new HashSet<>();
        String lowerCase = str.toLowerCase().toLowerCase();
        int originalLength = lowerCase.length();
        for (char c : lowerCase.toCharArray()) {
            set.add(c);
        }

        if (originalLength == set.size() || originalLength == 0) {
            return true;
        }
        return false;
    }

    public static boolean isIsogram2(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}

/*
* https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
* 회고
* stream을 이용한 distinct 문자 개수 구하는 방법이라니! 정말 간단하다.
*
* */