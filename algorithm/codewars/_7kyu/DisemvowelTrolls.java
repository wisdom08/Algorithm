package codewars._7kyu;

public class DisemvowelTrolls {

    public static final String VOWELS = "a|e|i|o|u|A|E|I|O|U";

    public static void main(String[] args) {
        String disemvowel = Troll.disemvowel("This website is for losers LOL!");
        System.out.println("disemvowel = " + disemvowel);
    }

    public class Troll {
        public static String disemvowel(String str) {
            return str.replaceAll(VOWELS,"");
        }
    }
}

/*
* https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
* 회고
* 어제 다른 사람 풀이 봤던 걸 응용해서 풀었다.
* or 처리가 되지 않을까? 하고 했는데 돼서 신기하다.
* 그리고 모음은 변하지 않는 값이니까 상수처리를 해봤다.
* */