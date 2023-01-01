package codewars._8kyu;

public class CountingSheep {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }
}

/*
* https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/solutions/java
* 회고
* String.format() 활용도 해보자
* */