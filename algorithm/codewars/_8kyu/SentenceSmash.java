package codewars._8kyu;

public class SentenceSmash {

    public static void main(String[] args) {
        String smash = smash(new String[]{"Bilal", "Djaghout"});
        System.out.println("smash = " + smash);
    }

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words.length - 1 == i) {
                sb.append(words[i]);
            } else {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString();
    }

    public static String smash_2(String... words) {
        return String.join(" ", words);
    }
}

/*
* https://www.codewars.com/kata/53dc23c68a0c93699800041d/java
* 회고
* String.join 메서드 쓰는 법을 까먹어서 찾아보고 사용했다.
* */