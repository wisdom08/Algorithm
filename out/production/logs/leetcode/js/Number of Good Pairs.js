/**
 * 계획
 * 1. 반복문 안에 다시 반복문을 돌려서 순차적으로 하나 씩 체크 할 수 있게 처리한다.
 * **/

const numIdenticalPairs = (nums) => {

    let result = 0;

    for (let i = 0; i < nums.length; i++) {
        nums.filter((num, index) => {
            if (i < index && nums[i] === num) {
                result++;
            }
        })
    }

    return result;
}

console.log(numIdenticalPairs([1, 2, 3, 1, 1, 3]));
console.log(numIdenticalPairs([1,1,1,1]));

/**
 * 회고
 * 다 풀고나니, 이중 for 문이 아니라 괜히 filter 를 쓴 것 같다.
 * 왜냐하면 이중 for 문으로 풀었다면 내부 반복문에서 시작값을 지정할 수 있기 때문에 반복 횟수가 줄어들기 때문이다.
 */