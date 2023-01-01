package codewars._7kyu;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)) {
            return true;
        }
        return false;
    }
}


/*
* https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
* 회고
* 분기분 처리를 하지 않아도 됐다. 왜냐하면 endsWith() 메서드의 결과값 자체가 boolean 값이기 때문!
* */