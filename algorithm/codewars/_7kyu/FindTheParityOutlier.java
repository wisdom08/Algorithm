package codewars._7kyu;

import java.util.HashMap;

public class FindTheParityOutlier {

    public static void main(String[] args) {
        int i = find(new int[]{2,6,8,-10,3});
        System.out.println("i = " + i);
    }
    static int find(int[] integers){

        /*
        * 반복문을 돌려서 각각의 map 에 홀/짝을 나눠서 담자
        * 한 map 의 size 가 2가 됐을 때 나머지 다른 맵의 첫 번째 값을 리턴한다.
        * */
        HashMap mapForEven = new HashMap<>();
        HashMap mapForOdd = new HashMap<>();
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                mapForEven.put(i, true);
            } else {
                mapForOdd.put(i, false);
            }

            if (mapForEven.size() >= 2 && mapForOdd.size() == 1) {
                for (Object r : mapForOdd.keySet()) {
                    return integers[(int) r];
                }
            } else if (mapForOdd.size() >= 2 && mapForEven.size() == 1) {

                for (Object r : mapForEven.keySet()) {
                    return integers[(int) r];
                }
            }
        }
        return 0;
    }
}

/*
* https://www.codewars.com/kata/54c27a33fb7da0db0100040e
* 회고
* 맵을 사용하는 것보다는 홀/짝 카운트 수를 각각 세어서 분기문 처리하는게 더 효율적이었을 것같다. 왜나하면 지금 홀짝을 구분하기 위해 담은 true/false 값은 전혀 사용되고 있지 않기 때문이다.
* */