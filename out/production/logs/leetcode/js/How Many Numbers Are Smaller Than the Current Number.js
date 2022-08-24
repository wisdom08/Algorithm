/**
 * 계획
 * 주어진 배열에서 각 숫자보다 작은 숫자가 몇 개 있는지 찾는 문제
 * 1. 반복문 안에 반복문 돌려서 전체 순회
 * 2. 문제에 주어진 조건문 추가
 * **/

const smallerNumbersThanCurrent = (nums) => {
    let result = [];
    for (let i = 0; i < nums.length; i++) {
        let count = 0;
        for (let j = 0; j < nums.length; j++) {
            if(nums[i] > nums[j]) count++;
        }
        result.push(count);
    }
    return result;
}

const smallerNumbersThanCurrent_best = function(nums) {
    const sorted = [...nums].sort((a, b) => a - b);
    return nums.map((num) => {
        return sorted.indexOf(num)
    });
};


console.log((smallerNumbersThanCurrent([6, 5, 4, 8])));
console.log(smallerNumbersThanCurrent_best([8, 1, 2, 2, 3]));

/**
 * 회고
 * 이중 for 문 말고 다른 방법으로 풀고 싶었는데 방법이 떠오르지 않았다.
 *
 * _best: leetcode-discuss 탭 참고
 * 주어진 배열을 먼저 작은 숫자부터 큰 숫자 순서로 정렬해서 새로운 배열을 만든다. -> 그 정렬된 새 배열의 인덱스가 나타내는 게 각각 현재값보다 작은 숫자가 몇 개인지를 뜻하게 된다.
 * 저렇게 생각해서 푸는 게 신기하다.
 *
 * Array.prototype.sort()
 * The sort() method sorts the elements of an array in place and returns the sorted array.
 * The default sort order is ascending, built upon converting the elements into strings, then comparing their sequences of UTF-16 code units values.
 * The time and space complexity of the sort cannot be guaranteed as it depends on the implementation.
 *
 * Array.prototype.indexOf()
 * The indexOf() method returns the first index at which a given element can be found in the array, or -1 if it is not present.
 */