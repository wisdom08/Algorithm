package leetcode.java.binarySearch;

public class _34 {
    public static void main(String[] args) {
        Solution_34 s = new Solution_34();
        int[] ints = s.searchRange_2(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}

class Solution_34 {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }


    public int[] searchRange_2(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    static int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    static int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
}

/*
* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
* 회고
* 두 가지 방식으로 품
* 바이너리서치 아직 좀 어렵다.
* */