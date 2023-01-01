package codewars._8kyu;

public class Feast {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(
            dish.length() - 1);
    }
}

/*
* https://www.codewars.com/kata/5aa736a455f906981800360d/java
* 회고
* codewars 가 아니라 실제 개발 로직이라고 가정하면 초기 문자를 비교하는 메서드와 마지막 문자를 비교하는 메서드를 따로 만드는게 좋을 것 같다.
* 실제로 그렇게 푼 답안도 있어서 흥미로웠다.
* */