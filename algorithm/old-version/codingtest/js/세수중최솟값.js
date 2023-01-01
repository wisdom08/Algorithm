// 정렬 사용 X
function solution(a, b, c) {

    if (a > b) {
        if (b > c) return c;
        else if (b < c) return b;
    } else if (a < b) {
        if (a > c) return c;
        else if (a < c) return a;
    } else if (c > a) {
        if(a > b) return b;
        else if (a < b) return a;
    }
}

console.log(solution(2, 5, 1));