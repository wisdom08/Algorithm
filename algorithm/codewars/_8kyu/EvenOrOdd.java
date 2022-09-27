package codewars._8kyu;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}


/*
* https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/java
* 회고
* 삼항연산자로 많이들 푸는 것 같다. 양자택일이니까 삼항연산자로 푸는 것도 간결하고 좋았을 것 같다.
* */