package codewars._8kyu;

public class Shortcut {

    public static void main(String[] args) {
        String hello = shortcut("hello");
        System.out.println("hello = " + hello);
    }
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String shortcut_2(String input) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (input.contains(vowel)) {
                input = input.replace(vowel, "");
            }
        }
        return input;
    }
}

/*
* https://www.codewars.com/kata/5547929140907378f9000039/train/java
* */