package codewars._8kyu;

public class Greeter {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }

    public static String greet_2(String name) {
        return "Hello, " + ((name.equals("Johnny") ? "my love" : name)) +"!";
    }
}

/*
 * https://www.codewars.com/kata/55225023e1be1ec8bc000390/train/java
 * 회고
 * 난이도가 쉬워서그런지 clever 답안 중에 눈에 띄는 건 없었다.
 * 문제에서 name 에 대한 조건이 없어서 name.isEmpty() 메서드를 이용해서 체크해주는 건 필요해보인다.
 * */
