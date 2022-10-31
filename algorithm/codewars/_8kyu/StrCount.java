package codewars._8kyu;

public class StrCount {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (Character c : str.toCharArray()) {
            if (c.equals(letter)) {
                ++count;
            }
        }
        return count;
    }
}

/*
* https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
* */