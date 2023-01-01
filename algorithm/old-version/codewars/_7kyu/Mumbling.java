package codewars._7kyu;

public class Mumbling {

    public static final String DELIMITER = "-";

    public static void main(String[] args) {
        String string = accum("cwAt");
        System.out.println("string = " + string);
    }

    public static String accum(String s) {
        /*
         * 반복문을 돌린다. i=1부터 시작
         * i 갯수만큼 문자 반복하는데 각 반복의 첫 문자는 대문자로, 나머지 소문자
         * 각 문자의 반복문 사이에 "-" 구분자 추가
         * */

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            StringBuilder repeatedCharacter = generateRepeatedCharacter(i, s.charAt(i - 1));
            if (s.length() == i) {
                sb.append(repeatedCharacter);
            } else {
                sb.append(repeatedCharacter).append(DELIMITER);
            }
        }
        return sb.toString();
    }

    private static StringBuilder generateRepeatedCharacter(int i, Character c) {
        StringBuilder characterSpace = new StringBuilder();
        characterSpace.append(String.valueOf(c).toUpperCase());
        characterSpace.append(c.toString().toLowerCase().repeat(i-1));
        return characterSpace;
    }
}

/*
 * https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
 * 회고
 * 스텝을 먼저 작성하고 코드를 작성해봤다. 사전에 작성한 스탭에서는 자세하게 고려하지 못했던 부분들이 많았던 것같다. 특히 첫 문자는 대문자로, 나머지는 소문자로 바꾸는 부분이 꽤 오래 걸렸다.
 * 쪼개서 생각하면 빠르게 해결할 수 있었던 부분이었다. 메서드명이랑 변수명도 고민해보고 작성해봤는데 적절한지는 잘 모르겠다. 지금 읽고 있는 클린코드 책을 다 읽으면 좀 더 개선되지 않을까? 싶다.
 * */