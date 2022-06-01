const shuffle = (nums, n) => {
    let frontArr = [];
    let backArr = [];
    let result = [];

    nums.map((v, i) => {
        i < n ? frontArr.push(v) : backArr.push(v);
    })

    for (let i = 0; i < n; i++) {
        result.push(frontArr[i], backArr[i]);
    }

    return result;
}

console.log(shuffle([2, 5, 1, 3, 4, 7], 3));
