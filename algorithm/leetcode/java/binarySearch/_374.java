package leetcode.java.binarySearch;

public class _374 {}

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}

/*
* https://leetcode.com/problems/guess-number-higher-or-lower/?envType=study-plan&id=binary-search-i
* 회고
* 바이너리서치 관련 문제를 codewars 에서도 풀어봐야겠다. 좀 더 새로운 문제를 풀고 싶다.
* */