const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

input = Number(input[0]);
solution(input);

function solution(input) {

    let result;

    if(input % 4 === 0 && !(input % 100 === 0)) result = 1;
    else if (input % 400 === 0) result = 1;
    else result = 0;

    console.log(result);
}
