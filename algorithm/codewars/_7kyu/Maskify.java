package codewars._7kyu;

public class Maskify {
    public static String maskify(String str) {
        if(str.length() <= 4) return str;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            sb.append("#");
        }
        return sb.append(str.substring(str.length() - 4)).toString();
    }
}

/*
* https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
* 회고
* 새로운 공간을 만들어서 더할 수도 있겠지만 스트링을 배열로 바꿔서 마지막 4자리 빼고 '#' 로 바꾸는 방법도 있다.
* */