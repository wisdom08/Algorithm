package leetcode.java.binarySearch;

import java.util.Arrays;

public class _1385 {
    public static void main(String[] args) {
        Solution_1385 s = new Solution_1385();
        s.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2);
    }
}

class Solution_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance = 0;

        for (int i=0;i<arr1.length;i++) {
            int from=arr1[i]-d;
            int to=arr1[i]+d;
            boolean flag=false;

            int start = 0;
            int end = arr2.length - 1;

            while (start <= end) {
                int mid = (end+start) / 2;
                if (arr2[mid] >= from && arr2[mid] <= to) {
                    flag=true;
                    break;
                } else if (arr2[mid] < from) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if(!flag) distance++;
        }
        return distance;
    }
}

/*
* https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
* 회고
* 목표로 했던 바이너리서치 5문제를 다 풀었다. 시작,끝,중간 변수만 잘 세우면 된다. 더 나은 방법이 있을까? 리트코드에서 다른 사람들이 푼 것도 여러개 봤는데 인상깊은 답변은 없었다.
* */