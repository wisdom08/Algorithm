const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

input = input[0];
input = input.split(' ').map((item) => +item);

solution(input[0], input[1]);

function solution(h, m) {

    if (m >= 45) {
        console.log(h, m-45)
    } else {
        if (h === 0) {
            console.log(23, (m - 45 + 60));
        } else {
            console.log(h-1, (m - 45 + 60));
        }
    }

}
