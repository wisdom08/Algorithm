const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');


let current = input[0];
const cookTime = Number(input[1]);
current = current.split(' ').map((item) => +item);

solution(current, cookTime);

function solution(current, cookingTime) {

    let h = current[0];
    let m = current[1];
    let value = m + cookingTime;

    if (value >= 60) {

        h = Math.floor(value / 60) + h;
        m = value % 60;

        if (h >= 24) {
            h -= 24;
        }

        console.log(h, m);
    } else {
        console.log(h,value);
    }
    
}
