package leetcode.java.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089 {
    public static void main(String[] args) {
        Solution_2089 s = new Solution_2089();
        List<Integer> integers = s.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }
    }
}

class Solution_2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) list.add(i);
        }
        return list;
    }
}

/*
* https://leetcode.com/problems/find-target-indices-after-sorting-array/
* 회고
* 바이너리서치 방식으로는 어떻게 풀어야하는지 잘 모르겠다. 다음에 다시 풀어봐야겠다.
* */