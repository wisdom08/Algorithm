package codewars._8kyu;

public class CalculateAge {

    public static void main(String[] args) {
        String s = CalculateAge(2011, 2012);
        System.out.println("s = " + s);
    }

    public static String CalculateAge(int birth, int yearTo) {
        int result = yearTo - birth;

        if (result == 0) {
            return "You were born this very year!";
        }

        if (result == 1) {
            return String.format("You are %d year old.", result);
        }

        if (result == -1) {
            return String.format("You will be born in %d year.", Math.abs(result));
        }

        if (result > 0) {
            return String.format("You are %d years old.", result);
        }

        return String.format("You will be born in %d years.", Math.abs(result));
    }
}

/*
 * https://www.codewars.com/kata/5761a717780f8950ce001473/train/java
 * */