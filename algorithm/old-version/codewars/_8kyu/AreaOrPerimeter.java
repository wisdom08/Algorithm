package codewars._8kyu;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if(l==w) return l*w;
        return 2 * (l + w);
    }
}

/*
* https://www.codewars.com/kata/5ab6538b379d20ad880000ab/java
* 회고
* 삼항연산자로 풀 수도 있다. l==w 조건문에 따라 반환되는 값이 다르다는 것만 파악하면 쉽게 풀 수 있는 문제.
* */