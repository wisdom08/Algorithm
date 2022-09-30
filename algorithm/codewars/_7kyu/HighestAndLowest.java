package codewars._7kyu;

public class HighestAndLowest {

    public static void main(String[] args) {
        HighestAndLowest_Problem p = new HighestAndLowest_Problem();
        String s = p.highAndLow("1 2 -3 4 5");
        System.out.println("s = " + s);
    }
    public static class HighestAndLowest_Problem {
        public static String highAndLow(String numbers) {
            String[] arr = numbers.split(" ");
            StringBuilder sb = new StringBuilder();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (String s : arr) {
                int i = Integer.parseInt(s);
                min = Math.min(i, min);
                max = Math.max(i, max);
            }

            return sb.append(max).append(" ").append(min).toString();
        }
    }
}

/*
* https://www.codewars.com/kata/554b4ac871d6813a03000035/java
* 회고
* stream 을 공부하는게 시급하다고 느낀다.
* */