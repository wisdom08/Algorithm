const fs = require('fs');
let input = fs.readFileSync(0).toString().split('\n');

input = input.map(x => +x);
solution(input)

function solution(input) {
    let x = input[0];
    let y = input[1];

    if(x>0 && y > 0) console.log(1)
    else if (x>0 && y < 0) console.log(4);
    else if (x<0 && y<0) console.log(3);
    else console.log(2);
}
