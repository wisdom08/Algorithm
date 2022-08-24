/**
 * 계획
 * nums.length / 2 만큼 총 반복
 * nums[1] 을 nums[0] 번 반복해서 새로운 배열 result[] 에 추가
 * nums[3] 을 nums[2] 번 반복해서 새로운 배열 result[] 에 추가
 * ...
 * **/

const decompressRLElist = (nums) => {
    let result = [];
    let value = 1;
    let itr = 0;
    for (let i = 0; i < nums.length / 2; i++) {
        for (let i = 0; i < nums[itr]; i++) {
            result.push(nums[value]);
        }
        itr +=2;
        value += 2;

    }
    return result;
}

console.log(decompressRLElist([1, 2, 3, 4]));

/**
 * 회고
 * 아래 문법을 알고 써먹을 정도로 익숙했다면 해당 문제를 좀 더 쉽게 풀 수 있었을 것 같다!
 * new Array(length) 의 의미는 length 만큼의 빈 배열이 생성된다는 것이고,
 * Array.fill(value) 의 의미는 value 로 배열을 채운다는 의미이다.
 * + fill(value, start) / fill(value, start, end)
 */