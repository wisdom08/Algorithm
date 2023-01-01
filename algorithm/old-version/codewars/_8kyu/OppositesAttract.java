package codewars._8kyu;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 == 0) || (flower1 % 2 == 1 && flower2 % 2 ==1)) {
            return false;
        }
        return true;
    }

    public static boolean isLove_2(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}


/*
* https://www.codewars.com/kata/555086d53eac039a2a000083/java
* 회고
* (a+b)%2 != 0 ? true : false;
* 인상적인 답안이다. 문제 그대로 각각 홀수인지, 짝수인지 확인하려고만 했지 두 개의 숫자를 더해서 홀짝을 확인할 생각까지는 못했다.
* */