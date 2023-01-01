package codewars._6kyu;

public class SpinWords {

    public static void main(String[] args) {
        SpinWords s = new SpinWords();
        String a = s.spinWords("helloooo asdfasdfasdf");
        System.out.println("a = " + a);
    }

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}

/*
* https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
* 회고
* String 배열을 String 으로 바꾸는 게 기억이 안나서 구글링함.
* String.join(delimiter, s)
* */
