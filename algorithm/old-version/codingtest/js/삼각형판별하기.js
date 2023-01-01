// 삼각형은 세 변의 길이 중 가장 긴 변이 나머지 두 변의 길이의 합보다 작아야 한다.
function solution(a, b, c){
    let answer="YES", max, sum;
    if (a > b) {
        max = a;
        sum = b + c;
    } else {
        max = b;
        sum = a+c;
    }

    if (c > max) {
        max = c;
        sum = a+b;
    }

    if(max < sum) return answer;
    else return "NO"

}

console.log(solution(13, 33, 17));
console.log(solution(6, 7, 11));