package codewars._7kyu;

public class ShortestWord {

    public static void main(String[] args) {
        int result = findShort("Let's travel abroad shall we");
        System.out.println("result = " + result);
    }

    public static int findShort(String s) {
        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        for (String word : split) {
            int length = word.length();
            if (min > length) {
                min = length;
            }
        }
        return min;
    }
}

/*
* https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
* 회고
* 스트림을 이용해서 길이순으로 정렬하고 첫 번째 걸 리턴하는 방법으로도 풀 수 있구나. 신기하다.
* Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)).findFirst().get().length();
* */