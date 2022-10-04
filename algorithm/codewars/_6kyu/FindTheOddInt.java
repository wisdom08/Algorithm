package codewars._6kyu;

import java.util.HashMap;

public class FindTheOddInt {

    public static void main(String[] args) {
        int result = findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5});
        System.out.println("result = " + result);
    }
    public static int findIt(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer) % 2 != 0) {
                return integer;
            }
        }
        return 1;
    }
}


/*
* https://www.codewars.com/kata/54da5a58ea159efa38000836/java
* 회고
* Integer 를 담고 있는 리스트를 만들고나서 객체가 몇 번 등장했는지를 리턴해주는 Collections.frequency() 메서드를 활용하는게 인상 깊었다.
* */