package codewars._6kyu;

public class VowelCount {

    public static void main(String[] args) {
        int abracadabra = Vowels.getCount("abracadabra");
        System.out.println("abracadabra = " + abracadabra);
    }

    public class Vowels {
        public static int getCount(String str) {
            char[] chars = str.toCharArray();
            int numberOfVowels = 0;
            for (char c : chars) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    ++numberOfVowels;
                }
            }

            return numberOfVowels;
        }

    }
}

/*
* https://www.codewars.com/kata/54ff3102c1bad923760001f3
* 회고
* 다른 사람이 푼 답안 중에 처음 인풋의 길이를 변수에 담고나서 아래 코드처럼 모음을 전부 없애고나서의 길이를 구한다음 처음 길이에서 모음을 없애고 난 후의 길이를 뺀 결과값을 반환하는 풀이가 있었다.
* 정말 생각지도 못했던 방법이고 신선한다고 생각했다.
* str = str.replaceAll("a", "");
* str = str.replaceAll("e", "");
* str = str.replaceAll("i", "");
* str = str.replaceAll("o", "");
* str = str.replaceAll("u", "");
* */
