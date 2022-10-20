package codewars._8kyu;

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && !vacation) return true;
        return false;
    }
}

/*
* https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
* 회고
* if 조건문 없이 return employed && !vacation; 로 작성하는게 좀 더 간결한 것 같다.
* */