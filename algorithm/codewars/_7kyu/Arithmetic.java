package codewars._7kyu;

public class Arithmetic {
    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a*b;
            case "divide":
                return a/b;
        }
        return 0;
    }
}

/*
* https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
* */