package codewars._8kyu;

public class StringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}

/*
* https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
* 회고
* string.split(",", 3); 한 번도 써보지는 못했지만 파라미터로 배열의 최대 개수를 지정할 수도 있다는 걸 알았다. 유용하게 쓰일 수 있을 것 같다.
* */