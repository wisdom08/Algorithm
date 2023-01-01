package leetcode.java.binarySearch;

public class _852 {
    public static void main(String[] args) {
        Solution_852 s = new Solution_852();
        int i = s.peakIndexInMountainArray(new int[]{0, 1, 0});
        System.out.println("i = " + i);
    }
}

class Solution_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;
    }
}

/*
* https://leetcode.com/problems/peak-index-in-a-mountain-array/?envType=study-plan&id=binary-search-i
* 회고
* 유형 별로 푸니까 해당 유형의 푸는 속도가 점점 줄어드는 것같다.
* */