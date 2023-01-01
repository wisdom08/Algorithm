package codewars._8kyu;

public class DoubleChar {
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}

/*
* https://www.codewars.com/kata/56b1f01c247c01db92000076/train/java
* */