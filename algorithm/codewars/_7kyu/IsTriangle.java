package codewars._7kyu;

public class IsTriangle {
    public static boolean isTriangle(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

/*
* https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
* */