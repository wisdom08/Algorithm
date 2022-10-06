package leetcode.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _169 {
    public static void main(String[] args) {
        int i = majorityElement_3(new int[]{8,8,7,7,7});
        System.out.println("i = " + i);
    }

    public static int majorityElement_3(int[] nums) {
        int potentialMajority = nums[0];
        int count = 1;
        for (int num : nums) {
            if (potentialMajority == num) {
                ++count;
            } else {
                --count;
            }

            if (count == 0) {
                potentialMajority = num;
                count = 1;
            }
        }

        return potentialMajority;
    }

    public static int majorityElement_2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }

            if (map.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

/*
* https://leetcode.com/problems/majority-element/
* 회고
* 정말 다양한 방법으로 풀 수 있다. 디버깅하면서 내가 푼 방법 말고도 어떻게 돌아가는지 파악했다. 세 번째 방법이 속도도 빠르고 메모리도 적게 차지한다.
* */