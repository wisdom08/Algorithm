const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

input = input[0];
input = input.split(' ').map((item) => +item);

solution(input[0], input[1], input[2]);

function solution(a, b, c) {
    if (a===b && a===c) {
        console.log(10000+(a*1000))
    } else if (a === b) {
        console.log(1000 + (a*100))
    } else if (a === c) {
        console.log(1000 + (a*100))
    } else if (b === c) {
        console.log(1000 + (b*100))
    } else {
        let max = a;

        if (b > a) {
            if(b>c) max = b;
            else if (c>b) max = c;
        } else if (c > a) {
            if(c>b) max = c;
            else if(b>c) max = b;
        }

        console.log(max * 100);
    }
}
